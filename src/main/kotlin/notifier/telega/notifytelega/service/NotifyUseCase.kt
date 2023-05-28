package notifier.telega.notifytelega.service

import notifier.telega.notifytelega.dataproviders.relational.chats.ChatRepository
import notifier.telega.notifytelega.dataproviders.telegram.SendMessageDataProvider
import notifier.telega.notifytelega.dataproviders.telegram.SendMessageInDto
import notifier.telega.notifytelega.service.dto.NotifyInDto
import org.springframework.stereotype.Service

@Service
class NotifyUseCase(
    private val chatRepository: ChatRepository,
    private val sendMessageDataProvider: SendMessageDataProvider
) {

    fun execute(inDto: NotifyInDto) {
        val chat = chatRepository.findByGlobalChannelId(inDto.globalChannelId)
            ?: throw RuntimeException("Chat not found!")
        sendMessageDataProvider.execute(
            SendMessageInDto(
                chatId = chat.chatId,
                text = inDto.text
            )
        )
    }

}
