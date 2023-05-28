package notifier.telega.notifytelega.config

import notifier.telega.notifytelega.usecase.ProcessChatInvasionUseCase
import notifier.telega.notifytelega.usecase.dto.ProcessChatInvasionInDto
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import org.telegram.telegrambots.bots.TelegramLongPollingBot
import org.telegram.telegrambots.meta.api.objects.Update

//TODO мб в ентрипоинт?
@Component
class SasnyRobot(
    @Value("\${bot.token}") token: String,
    @Value("\${bot.name}") private val botName: String,
    private val processChatInvasionUseCase: ProcessChatInvasionUseCase
) : TelegramLongPollingBot(token) {

    override fun getBotUsername() = botName

    //TODO мб выкидывать событие?
    override fun onUpdateReceived(update: Update) {
        processChatInvasionUseCase.execute(
            ProcessChatInvasionInDto(update)
        )
    }

}
