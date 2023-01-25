package kotlins

import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.runBlocking

/*
    This will output 0 1 2 2
    debounce is ignoring any values emitted faster than the previous one
 */
@OptIn(FlowPreview::class)
fun testBasicFlowDebounceCollection() = runBlocking {
    basicFlow().debounce(80).collect {
        log("BasicFlowDebounceCollect emitted value: $it")
    }
}