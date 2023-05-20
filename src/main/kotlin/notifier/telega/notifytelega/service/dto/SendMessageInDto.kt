package notifier.telega.notifytelega.service.dto

data class SendMessageInDto(
    val chatId: String,
    val text: String
)
