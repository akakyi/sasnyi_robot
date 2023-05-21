package notifier.telega.notifytelega.dataproviders.telegram

data class SendMessageInDto(
    val chatId: String,
    val text: String
)
