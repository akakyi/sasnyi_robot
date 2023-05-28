package notifier.telega.notifytelega.dataprovider.amqp.channelcreation

import notifier.telega.notifytelega.model.ChannelType
import java.util.*

data class ChannelPayload(
    val globalChannelId: UUID,
    val globalUserId: UUID,
    val channelName: String,
    val channelType: ChannelType
)
