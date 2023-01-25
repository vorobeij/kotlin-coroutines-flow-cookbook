package kotlins

import kotlinx.coroutines.flow.take
import kotlinx.coroutines.runBlocking

/*
    This will output 0 0 1
    take will just take first 3 elements from the flow and finish
 */
fun testBasicFlowTakeCollection() = runBlocking {
    basicFlow().take(3).collect {
        log("BasicFlowDebounceCollect emitted value: $it")
    }
}