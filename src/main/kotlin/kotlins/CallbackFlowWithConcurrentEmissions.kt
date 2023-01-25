package kotlins

import kotlinx.coroutines.runBlocking

/*
    This will work fine and emit 1 2. CallbackFlow is designed to deal specifically with callbacks.
    Great replacement for custom Rx Callback Observables
 */
fun testCallbackFlowWithConcurrentEmissions() = runBlocking {
    callbackFlow().collect {
        log("CallbackFlow value: $it")
    }
}