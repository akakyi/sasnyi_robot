package notifier.telega.notifytelega.entrypoint.dto

import java.util.*

data class RabbitNewUserListenerRequest(
    val globalUserId: UUID,
    val telegramId: String
)
