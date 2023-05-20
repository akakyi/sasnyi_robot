package notifier.telega.notifytelega.service

import notifier.telega.notifytelega.config.SasnyRobot
import notifier.telega.notifytelega.service.dto.SendMessageInDto
import org.springframework.stereotype.Service
import org.telegram.telegrambots.meta.api.methods.send.SendMessage

@Service
class SendMessageUseCase(
    private val sasnyRobot: SasnyRobot
) {

    fun execute(inDto: SendMessageInDto) {
        val msg = SendMessage(inDto.chatId, inDto.text)
        sasnyRobot.execute(msg)
    }

}
