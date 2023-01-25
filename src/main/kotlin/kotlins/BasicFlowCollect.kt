package kotlins

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.runBlocking

/*
    This will output 0 0 1 1 and then process will crash
    Exception is passed upstream
 */
suspend fun testBasicFlowCollect() = coroutineScope {
    basicFlowWithException().collect {
        log("BasicFlowCollect emitted value: $it")
    }
}

fun main(): Unit = runBlocking {
    testBasicFlowCollect()
}
