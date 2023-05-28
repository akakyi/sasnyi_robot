package notifier.telega.notifytelega.dataprovider.telegram

import notifier.telega.notifytelega.config.SasnyRobot
import org.springframework.stereotype.Service
import org.telegram.telegrambots.meta.api.methods.send.SendMessage

@Service
class SendMessageDataProvider(
    private val sasnyRobot: SasnyRobot
) {

    fun execute(inDto: SendMessageInDto) {
        val msg = SendMessage(inDto.chatId, inDto.text)
        sasnyRobot.execute(msg)
    }

}
