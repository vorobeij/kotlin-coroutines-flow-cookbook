package kotlins

import kotlin.system.measureTimeMillis
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

fun main() {
    runDummySolution()
    //kotlins.runChannelSolution()
    //kotlins.runFlowSolution()
    //kotlins.simulateDangerousChannelSituation()
}

//  ****
//  Task definitions
//  ****

suspend fun getResource(index: Int): Int {
    delay(1000)
    return index
}

fun Int.show() {
    log("Hey, my name is Integer with index $this")
}

//  ****
//  Default dummy solution
//  ****

/*
    This will wait 3 seconds and then immediately print all 3 resources
 */
fun runDummySolution() = runBlocking {
    val time = measureTimeMillis {
        val resources = getListOfResources()
        for (resource in resources) {
            resource.show()
        }
    }
    log("Ready in $time ms")
}

suspend fun getListOfResources(): List<Int> {
    return listOf(
        getResource(1),
        getResource(2),
        getResource(3)
    )
}

//  ****
//  Default channel solution
//  ****

/*
    This will print resource every second. Total duration same as kotlins.runDummySolution
 */
fun runChannelSolution() = runBlocking {
    val resourceChannel = channelOfResources()
    val time = measureTimeMillis {
        for (resource in resourceChannel) {
            resource.show()
        }
    }
    log("Ready in $time ms")
}

@OptIn(ExperimentalCoroutinesApi::class)
suspend fun CoroutineScope.channelOfResources(): ReceiveChannel<Int> = produce {
    send(getResource(1))
    send(getResource(2))
    send(getResource(3))
}

//  ****
//  Default flow solution
//  ****

/*
    This will do everything exactly like the kotlins.runChannelSolution
 */
fun runFlowSolution() = runBlocking {
    val resourceFlow = flowOfResources()
    val time = measureTimeMillis {
        resourceFlow.collect { resource ->
            resource.show()
        }
    }
    log("Ready in $time ms")
}

fun flowOfResources(): Flow<Int> = flow {
    emit(getResource(1))
    emit(getResource(2))
    emit(getResource(3))
}

//  ****
//  Key difference
//  ****

/*
    val resourceChannel = kotlins.channelOfResources() -> this already allocates resources
    in this example it will print 1, then after resuming it will print 2, 3.
    This means that the resources were not de-allocated and they were hanging in the air
    potentially providing memory leaks.

    val resourceFlow = kotlins.flowOfResources() -> this does not allocate resources yet, until you start observing the results
    in this example if replaced, this will print 1, then after resuming it will print 1, 2, 3.
    This means that the resources were de-allocated after scope cancellation and it is safe to use in such
    situations.
 */
fun simulateDangerousChannelSituation() = runBlocking {
    val shortLivedScope = CoroutineScope(Dispatchers.Default)
    val resourceChannel = channelOfResources()

    shortLivedScope.launch {
        for (resource in resourceChannel) {
            resource.show()
        }
    }

    delay(1500)
    shortLivedScope.cancel()

    log("Scope has been canceled. Will resume channel again")
    delay(1000)

    for (resource in resourceChannel) {
        resource.show()
    }
}