package kotlins

import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.runBlocking

/*
    This will output 'started', 0 0 1 1 'finished' 'exception'
    if catch is not used -> process will crash and exception will be passed upstream
 */
fun testBasicFlowOperators() = runBlocking {
    basicFlowWithException().onEach {
        log("BasicFlow emitted value: $it")
    }.onStart {
        log("BasicFlow has started its work")
    }.onCompletion {
        log("BasicFlow has finished its work")
    }.catch {
        log("BasicFlow has an exception $it")
    }.launchIn(this)
}