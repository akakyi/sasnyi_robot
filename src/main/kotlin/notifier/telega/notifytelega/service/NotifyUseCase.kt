package notifier.telega.notifytelega.service

import notifier.telega.notifytelega.service.dto.NotifyInDto
import org.springframework.stereotype.Service

@Service
class NotifyUseCase(
    private val sendMessageUseCase: SendMessageUseCase
) {

    fun execute(inDto: NotifyInDto) {

    }

}
