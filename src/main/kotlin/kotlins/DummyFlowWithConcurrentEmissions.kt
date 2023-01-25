package kotlins

import kotlinx.coroutines.runBlocking

/*
    This will crash. Because emission from any other or coroutine is not allowed.
    This can't be used for callbacks.
 */
fun testDummyFlowWithConcurrentEmissions() = runBlocking {
    dummyFlow().collect {
        log("DummyFlow value: $it")
    }
}