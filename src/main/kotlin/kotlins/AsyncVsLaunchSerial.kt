package kotlins

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
    This shall output:
    [Coroutines] Executed iteration: 1
    [Coroutines] Executed iteration: 2
    [Coroutines] Executed iteration: 1
    [Coroutines] Executed iteration: 2

    as the `await()` for Deferred and `join()` for Job both suspends the current scope and waits for completion
 */
private suspend fun asyncVsLaunchSerial() = coroutineScope {
    async { someAsyncTask(1) }.await()
    launch { someAsyncTask(2) }.join()

    launch { someAsyncTask(1) }.join()
    async { someAsyncTask(2) }.await()
}

fun main(): Unit = runBlocking {
    asyncVsLaunchSerial()
}