package notifier.telega.notifytelega.usecase.dto

import java.util.*

data class CreateUserInDto(
    val globalUserId: UUID,
    val telegramUserId: String
)
