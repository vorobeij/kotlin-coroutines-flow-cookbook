package kotlins

import kotlinx.coroutines.ObsoleteCoroutinesApi
import kotlinx.coroutines.channels.ConflatedBroadcastChannel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
    This shall print 2 and 3, because after subscription it will always emit the last value which was pushed to
    the channel first.
    This works in the same way like RxJava BehaviourSubject
 */
@OptIn(ObsoleteCoroutinesApi::class)
fun simulateConflatedBroadcastChannel() = runBlocking {
    val channel = ConflatedBroadcastChannel<Int>()

    launch {
        channel.trySend(1)
        channel.trySend(2)
    }

    launch {
        channel.consumeEach {
            log("Receiving something $it")
        }
    }

    launch {
        channel.trySend(3)
    }
}