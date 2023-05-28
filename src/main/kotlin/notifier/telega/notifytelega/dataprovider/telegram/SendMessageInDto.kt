package notifier.telega.notifytelega.dataprovider.telegram

data class SendMessageInDto(
    val chatId: String,
    val text: String
)
