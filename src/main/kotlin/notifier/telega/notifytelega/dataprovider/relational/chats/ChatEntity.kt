package notifier.telega.notifytelega.dataprovider.relational.chats

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "chat")
open class ChatEntity(
    @Id
    val id: UUID,

    @field:Column(name = "global_channel_id")
    val globalChannelId: UUID,

    @field:Column(name = "chat_id")
    val chatId: String
)
