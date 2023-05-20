package notifier.telega.notifytelega.service

import notifier.telega.notifytelega.service.dto.ProcessChatInvasionInDto
import org.springframework.stereotype.Service

@Service
class ProcessChatInvasionUseCase {

    fun execute(inDto: ProcessChatInvasionInDto) {
        val chatMember = inDto.update.myChatMember
        if (chatMember == null) {
            return
        }

        println(chatMember.chat?.id)
    }

}
