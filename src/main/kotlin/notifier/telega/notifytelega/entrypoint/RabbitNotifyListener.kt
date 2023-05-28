package notifier.telega.notifytelega.entrypoint

import notifier.telega.notifytelega.entrypoint.dto.RabbitNotifyListenerRequest
import notifier.telega.notifytelega.service.NotifyUseCase
import notifier.telega.notifytelega.service.dto.NotifyInDto
import org.slf4j.LoggerFactory
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Component

@Component
class RabbitNotifyListener(
    private val notifyUseCase: NotifyUseCase
) {

    private val log = LoggerFactory.getLogger(RabbitNotifyListener::class.java)

    @RabbitListener(ackMode = "AUTO", queues = ["\${amqp.notify.key}"])
    fun forNotify(request: RabbitNotifyListenerRequest) {
        log.info("Got notify message: $request")

        notifyUseCase.execute(
            NotifyInDto(
                globalChannelId = request.globalChannelId,
                text = request.text
            )
        )
    }

}
