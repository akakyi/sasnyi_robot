package notifier.telega.notifytelega.usecase

import notifier.telega.notifytelega.dataproviders.relational.users.TelegramToGlobalUserRepository
import notifier.telega.notifytelega.usecase.dto.CreateChatInDto
import notifier.telega.notifytelega.usecase.dto.ProcessChatInvasionInDto
import org.springframework.stereotype.Service

@Service
class ProcessChatInvasionUseCase(
    private val createChatUseCase: CreateChatUseCase,
    private val telegramToGlobalUserRepository: TelegramToGlobalUserRepository
) {

    fun execute(inDto: ProcessChatInvasionInDto) {
        val update = inDto.update
        val chatMember = update.myChatMember ?: return

        //TODO создавать таски на оповещения о появлении нового канала, дабы в случае проёба пересоздавать мессагу
        val from = chatMember.from
        //TODO исключений навернуть своих
        val user = telegramToGlobalUserRepository.findByTelegramUserId(from.id.toString())
            ?: throw RuntimeException("Unknown telegram user ${from.id}")

        val chat = chatMember.chat
        createChatUseCase.execute(
            CreateChatInDto(
                telegramChatId = chat.id.toString(),
                telegramChatName = chat.title,
                globalUserId = user.id
            )
        )
    }

}
