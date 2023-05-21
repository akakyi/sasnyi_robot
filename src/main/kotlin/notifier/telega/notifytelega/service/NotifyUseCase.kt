package notifier.telega.notifytelega.service

import notifier.telega.notifytelega.dataproviders.telegram.SendMessageDataProvider
import notifier.telega.notifytelega.service.dto.NotifyInDto
import org.springframework.stereotype.Service

@Service
class NotifyUseCase(
    private val sendMessageDataProvider: SendMessageDataProvider
) {

    fun execute(inDto: NotifyInDto) {

    }

}
