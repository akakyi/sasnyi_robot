package notifier.telega.notifytelega.usecase.dto

import java.util.*

data class CreateChatInDto(
    val telegramChatId: String,
    val telegramChatName: String,
    val globalUserId: UUID
)
