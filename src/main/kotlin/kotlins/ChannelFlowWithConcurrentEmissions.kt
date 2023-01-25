package kotlins

import kotlinx.coroutines.runBlocking

/*
    This will work fine and emit 1 2, same like kotlins.callbackFlow
    What's the difference? Try removing awaitClose from kotlins.callbackFlow and it will crash
    kotlins.channelFlow - won't. Basically the difference is very minor, kotlins.callbackFlow is more secure
    awaitClose should be used to close any resources (like observers).
    Also, do not forget to call close() which notifies flow that there is nothing to listen to.
    close() should be called when the final action was performed.
 */
fun testChannelFlowWithConcurrentEmissions() = runBlocking {
    channelFlow().collect {
        log("ChannelFlow value: $it")
    }
}