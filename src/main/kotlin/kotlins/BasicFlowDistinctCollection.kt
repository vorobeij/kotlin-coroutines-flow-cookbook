package kotlins

import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.runBlocking

/*
    This will output 0 1 2
    distinctUntilChanged ignores any duplicates
 */
fun testBasicFlowDistinctCollection() = runBlocking {
    basicFlow().distinctUntilChanged().collect {
        log("BasicFlowDistinctCollect emitted value: $it")
    }
}