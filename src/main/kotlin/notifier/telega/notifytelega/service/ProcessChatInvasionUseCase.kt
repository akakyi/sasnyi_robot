package notifier.telega.notifytelega.service

import notifier.telega.notifytelega.dataproviders.relational.users.TelegramToGlobalUserRelationRepository
import notifier.telega.notifytelega.service.dto.CreateChatInDto
import notifier.telega.notifytelega.service.dto.ProcessChatInvasionInDto
import org.springframework.stereotype.Service

@Service
class ProcessChatInvasionUseCase(
    private val createChatUseCase: CreateChatUseCase,
    private val telegramToGlobalUserRelationRepository: TelegramToGlobalUserRelationRepository
) {

    fun execute(inDto: ProcessChatInvasionInDto) {
        val update = inDto.update
        val chatMember = update.myChatMember
        if (chatMember == null) {
            return
        }

        //TODO создавать таски на оповещения о появлении нового канала, дабы в случае проёба пересоздавать мессагу
        val from = chatMember.from
        //TODO исключений навернуть своих
        val user = telegramToGlobalUserRelationRepository.findByTelegramUserId(from.id.toString())
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