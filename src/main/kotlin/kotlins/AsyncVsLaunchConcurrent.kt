package kotlins

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
    This shall output:
    [Coroutines] Executed iteration: 1
    [Coroutines] Executed iteration: 2
    [Coroutines] Executed iteration: 3
    [Coroutines] Executed iteration: 4

    as async without await() will perform in the same way like a simple launch
 */
private suspend fun asyncVsLaunchConcurrent() = coroutineScope {
    async { someAsyncTask(1) }
    launch { someAsyncTask(2) }

    launch { someAsyncTask(3) }
    async { someAsyncTask(4) }
}

fun main(): Unit = runBlocking {
    asyncVsLaunchConcurrent()
}