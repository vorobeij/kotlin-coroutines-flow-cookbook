package kotlins

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
    This shall print 1 and 3, because capacity is 1 and the element 2 will be ignored
 */
fun simulateChannel() = runBlocking {
    val channel = Channel<Int>(capacity = 1)

    launch {
        channel.trySend(1) // sending first
        channel.trySend(2) // this one is ignored, because capacity = 1 and no one is listening
    }

    for (i in 0..1) {
        launch {
            channel.consumeEach {
                log("Receiving something $it")
            }
        }
    }

    launch {
        channel.trySend(3)
    }
}

fun main(): Unit = runBlocking {
    simulateChannel()
}