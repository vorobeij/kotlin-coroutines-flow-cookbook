package kotlins

import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

/*
    Deceiving example context switching
    In this case 1,2,3,4,5 will be printed every time, because when using the same IO thread pool
    The application does not switch threads. If there would be any other dispatcher (e.g. Unconfined)
    then the result might be different
 */
@OptIn(DelicateCoroutinesApi::class)
private fun contextPoolTest() = runBlocking {
    GlobalScope.launch(Dispatchers.IO) {
        log("1")
        withContext(Dispatchers.IO) {
            log("2")
            withContext(Dispatchers.IO) {
                log("3")
            }
            log("4")
        }
        log("5")
    }
    delay(100)
}

fun main(): Unit = runBlocking {
    contextPoolTest()
}