package kotlins

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

/*
    Just some generic context switching
 */
private fun contextSwitching() = runBlocking {
    val value = withContext(Dispatchers.IO) {
        someAsyncTask(1)
    }
    withContext(Dispatchers.Default) {
        someAsyncTask(2)
    }
}

fun main(): Unit = runBlocking {
    contextSwitching()
}