package kotlins

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.*

fun basicFlow(): Flow<Int> = flow {
    for (i in 0 until 3) {
        emit(i)
        delay(100)
        emit(i)
    }
}.flowOn(Dispatchers.IO)

fun basicFlowWithException(): Flow<Int> = flow {
    for (i in 0 until 3) {
        emit(i)
        delay(100)
        emit(i)
        if (i == 1) throw Error()
    }
}.flowOn(Dispatchers.IO)

/*
    replay represents the number of values emitted to new subscribers
    https://kotlinlang.org/api/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/-shared-flow/
 */
val sharedFlow = MutableSharedFlow<Int>(replay = 1)
val stateFlow = MutableStateFlow(69)

/*
    This will output 0 0 1 1 2 2
    Basically this acts like a channel and outputs everything
    Try removing delays though and it will output less values,
    because subscriber thread is too slow to listen to changes.
    SharedFlow is a hot replacement for BroadcastChannel
 */
fun testSharedFlow() = runBlocking {
    sharedFlow.asSharedFlow().onEach {
        log("SharedFlow value: $it")
    }.launchIn(this)

    for (i in 0 until 3) {
        sharedFlow.tryEmit(i)
        delay(100)
        sharedFlow.tryEmit(i)
        delay(100)
    }
}

//  ****
//  Callback/Channel Flow
//  ****

/*
    The following methods represent an attempt to provide some callback values from different threads
    1. Using generic Flow
    2. CallbackFlow
    3. ChannelFlow
 */
@OptIn(DelicateCoroutinesApi::class)
fun dummyFlow(): Flow<Int> = flow {
    GlobalScope.launch {
        emit(1)
        emit(2)
    }
    delay(100)
}

@OptIn(DelicateCoroutinesApi::class, ExperimentalCoroutinesApi::class)
fun callbackFlow(): Flow<Int> = callbackFlow {
    GlobalScope.launch {
        trySend(1)
        trySend(2)
        close()
    }
    delay(100)
    awaitClose { cancel() }
}

@OptIn(DelicateCoroutinesApi::class, ExperimentalCoroutinesApi::class)
fun channelFlow(): Flow<Int> = channelFlow {
    GlobalScope.launch {
        trySend(1)
        trySend(2)
        close()
    }
    delay(100)
    awaitClose { cancel() }
}

