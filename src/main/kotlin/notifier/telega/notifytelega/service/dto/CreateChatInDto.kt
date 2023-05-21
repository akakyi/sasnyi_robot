package notifier.telega.notifytelega.service.dto

import java.util.*

data class CreateChatInDto(
    val telegramChatId: String,
    val telegramChatName: String,
    val globalUserId: UUID
)
