package notifier.telega.notifytelega.entrypoint

import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Component

@Component
class RabbitNotifyListener {

    @RabbitListener(ackMode = "AUTO", queues = ["kotlin-notify"])
    fun forNotify() {

    }

}
