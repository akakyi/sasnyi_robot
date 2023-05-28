package notifier.telega.notifytelega.usecase.dto

import java.util.*

data class NotifyInDto(
    val globalChannelId: UUID,
    val text: String
)
