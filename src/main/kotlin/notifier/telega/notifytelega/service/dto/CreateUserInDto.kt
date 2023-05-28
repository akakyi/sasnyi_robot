package notifier.telega.notifytelega.service.dto

import java.util.*

data class CreateUserInDto(
    val globalUserId: UUID,
    val telegramUserId: String
)
