package notifier.telega.notifytelega.entrypoint

import notifier.telega.notifytelega.entrypoint.dto.RabbitNewUserListenerRequest
import notifier.telega.notifytelega.service.CreateUserUseCase
import notifier.telega.notifytelega.service.dto.CreateUserInDto
import org.slf4j.LoggerFactory
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Component

@Component
class RabbitNewUserListener(
    private val createUserUseCase: CreateUserUseCase
) {

    private val log = LoggerFactory.getLogger(RabbitNewUserListener::class.java)

    @RabbitListener(ackMode = "AUTO", queues = ["\${amqp.new_user.key}"])
    fun newUser(request: RabbitNewUserListenerRequest) {
        log.info("Got new user message: $request")

        createUserUseCase.execute(
            CreateUserInDto(
                globalUserId = request.globalUserId,
                telegramUserId = request.telegramId
            )
        )
    }

}
