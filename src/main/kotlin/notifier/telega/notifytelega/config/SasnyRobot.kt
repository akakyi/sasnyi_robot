package notifier.telega.notifytelega.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import org.telegram.telegrambots.bots.TelegramLongPollingBot
import org.telegram.telegrambots.meta.api.objects.Update

@Component
class SasnyRobot(
    @Value("\${bot.token}") token: String
) : TelegramLongPollingBot(token) {

    override fun getBotUsername() = "fm_noti_bot"

    override fun onUpdateReceived(update: Update) {
        println(update)
    }
}
