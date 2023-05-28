package notifier.telega.notifytelega.usecase

import notifier.telega.notifytelega.dataproviders.relational.users.TelegramToGlobalUserEntity
import notifier.telega.notifytelega.dataproviders.relational.users.TelegramToGlobalUserRepository
import notifier.telega.notifytelega.usecase.dto.CreateUserInDto
import org.springframework.stereotype.Service
import java.util.*

@Service
class CreateUserUseCase(
    private val telegramToGlobalUserRepository: TelegramToGlobalUserRepository
) {

    fun execute(inDto: CreateUserInDto) {
        telegramToGlobalUserRepository.save(
            TelegramToGlobalUserEntity(
                id = UUID.randomUUID(),
                telegramUserId = inDto.telegramUserId,
                globalUserId = inDto.globalUserId
            )
        )
    }

}
