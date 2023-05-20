package notifier.telega.notifytelega.service.dto

import java.util.*

data class NotifyInDto(
    val globalChannelId: UUID,
    val text: String
)
