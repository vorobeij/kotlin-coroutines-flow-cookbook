package kotlins

import kotlinx.coroutines.ObsoleteCoroutinesApi
import kotlinx.coroutines.channels.BroadcastChannel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
    BroadcastChannel can is hot:
    This shall print 3 and 3, because subscriber started listening after the values were sent to the channel
    This works in the same way like RxJava PublishSubject
 */
@OptIn(ObsoleteCoroutinesApi::class)
fun simulateBroadcastChannel() = runBlocking {
    val channel = BroadcastChannel<Int>(capacity = 1)

    launch {
        channel.trySend(1)
        channel.trySend(2)
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
    simulateBroadcastChannel()
}