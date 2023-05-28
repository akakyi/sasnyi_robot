package notifier.telega.notifytelega.dataprovider.relational.users

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface TelegramToGlobalUserRepository : JpaRepository<TelegramToGlobalUserEntity, UUID> {

    fun findByTelegramUserId(telegramUserId: String): TelegramToGlobalUserEntity?

}
