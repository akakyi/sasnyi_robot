package notifier.telega.notifytelega.dataproviders.relational.users

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface TelegramToGlobalUserRepository : JpaRepository<TelegramToGlobalUserEntity, UUID> {

    fun findByTelegramUserId(telegramUserId: String): TelegramToGlobalUserEntity?

}
