package notifier.telega.notifytelega.dataprovider.relational.users

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "telegram_global_user_relation")
open class TelegramToGlobalUserEntity(
    @Id
    val id: UUID,

    @field:Column(name = "telegram_user_id")
    val telegramUserId: String,

    @field:Column(name = "global_user_id")
    val globalUserId: UUID
)
