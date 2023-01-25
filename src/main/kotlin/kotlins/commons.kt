package kotlins

import kotlinx.coroutines.delay

suspend fun someAsyncTask(iteration: Int, duration: Long = 100L): Int {
    delay(duration)
    log("[Coroutines] Executed iteration: $iteration")
    return iteration
}


fun log(message: String) {
    println("%10.30s: %s".format(Thread.currentThread().name, message))
}