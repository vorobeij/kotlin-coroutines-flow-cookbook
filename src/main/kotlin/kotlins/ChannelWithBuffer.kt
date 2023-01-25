package kotlins

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
    This method attempts to send 10 values, but it will send the 5 values because of the set buffer
 */
fun simulateChannelWithBuffer() = runBlocking {
    val channel = Channel<Int>(capacity = 4)
    val sender = launch {
        repeat(10) {
            log("Sending $it")
            channel.send(it) // suspend execution on 5th item, because no one is listening AND this is Channel, not Broadcast
        }
    }
    delay(1000)
    sender.cancel()
}

fun main(): Unit = runBlocking {
    simulateChannelWithBuffer()
}