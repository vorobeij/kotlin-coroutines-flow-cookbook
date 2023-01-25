package kotlins

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
    This method attempts to send 10 values, but it will send only single, because the capacity of the buffer is zero
 */
fun simulateChannelWithoutBuffer() = runBlocking {
    val channel = Channel<Int>(capacity = Channel.RENDEZVOUS)
    val sender = launch { // launch sender coroutine
        repeat(10) {
            log("Sending $it") // print before sending each element
            channel.send(it) // suspend when buffer is full
        }
    }
    delay(1000)
    sender.cancel()
}

fun main(): Unit = runBlocking {
    simulateChannelWithoutBuffer()
}