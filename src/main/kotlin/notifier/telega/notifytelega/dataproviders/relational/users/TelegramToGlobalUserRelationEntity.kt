package notifier.telega.notifytelega.dataproviders.relational.users

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "telegram_global_user_relation")
open class TelegramToGlobalUserRelationEntity(
    @Id
    val id: UUID,

    @Column(name = "telegram_user_id")
    val telegramUserId: String,

    @Column(name = "global_user_id")
    val globalUserId: UUID
)
