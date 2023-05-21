package notifier.telega.notifytelega.dataproviders.amqp.channelcreation

import java.util.*

data class ChannelPayload(
    val globalChannelId: UUID,
    val globalUserId: UUID,
    val channelName: String
)
