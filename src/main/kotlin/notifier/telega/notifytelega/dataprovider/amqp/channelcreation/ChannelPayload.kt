package notifier.telega.notifytelega.dataprovider.amqp.channelcreation

import java.util.*

data class ChannelPayload(
    val globalChannelId: UUID,
    val globalUserId: UUID,
    val channelName: String
)
