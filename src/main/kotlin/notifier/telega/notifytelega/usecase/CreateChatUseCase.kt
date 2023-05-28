package notifier.telega.notifytelega.usecase

import notifier.telega.notifytelega.dataprovider.amqp.channelcreation.ChannelDataProvider
import notifier.telega.notifytelega.dataprovider.amqp.channelcreation.ChannelPayload
import notifier.telega.notifytelega.dataprovider.relational.chats.ChatEntity
import notifier.telega.notifytelega.dataprovider.relational.chats.ChatRepository
import notifier.telega.notifytelega.model.ChannelType
import notifier.telega.notifytelega.usecase.dto.CreateChatInDto
import org.springframework.stereotype.Service
import java.util.*

@Service
class CreateChatUseCase(
    private val channelDataProvider: ChannelDataProvider,
    private val chatRepository: ChatRepository
) {

    fun execute(inDto: CreateChatInDto) {
        val createdChat = chatRepository.save(
            ChatEntity(
                id = UUID.randomUUID(),
                globalChannelId = UUID.randomUUID(),
                chatId = inDto.telegramChatId
            )
        )

        channelDataProvider.sendChannelData(
            ChannelPayload(
                globalChannelId = createdChat.globalChannelId,
                globalUserId = inDto.globalUserId,
                channelName = inDto.telegramChatName,
                channelType = ChannelType.TELEGRAM
            )
        )
    }

}
