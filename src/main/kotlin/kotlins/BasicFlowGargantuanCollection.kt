package kotlins

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.reduce
import kotlinx.coroutines.runBlocking

/*
    This will output 0 0 1 1 2 2 sum 12
    This is just a simple operator display
 */
fun testBasicFlowGargantuanCollection() = runBlocking {
    val someWeirdSum = basicFlow().onEach {
        delay(200)
        log("Computing $it")
    }.filter {
        it % 2 == 0
    }.map {
        it + 2
    }.reduce { accumulator, value ->
        accumulator + value
    }
    log("SomeGargantuanSum: $someWeirdSum")
}