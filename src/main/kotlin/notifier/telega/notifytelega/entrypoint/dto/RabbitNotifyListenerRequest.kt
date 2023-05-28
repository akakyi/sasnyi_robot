package notifier.telega.notifytelega.entrypoint.dto

import java.util.*

data class RabbitNotifyListenerRequest(
    val globalChannelId: UUID,
    val text: String
)
