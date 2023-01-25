package kotlins

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking

/*
    This will output 0 1 2
    StateFlow is used to specifically work with states as it will only emit new states.
    StateFlow == SharedFlow with distinctUntilChanged applied.
    This is a perfect replacement for LiveData
 */
fun testStateFlow() = runBlocking {
    stateFlow.asStateFlow().onEach {
        log("StateFlow value: $it")
    }.launchIn(this)

    for (i in 0 until 3) {
        stateFlow.value = i
        delay(100)
        stateFlow.value = i
        delay(100)
    }
}