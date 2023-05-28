package notifier.telega.notifytelega.dataprovider.relational.chats

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ChatRepository : JpaRepository<ChatEntity, UUID> {

    fun findByGlobalChannelId(globalChannelId: UUID): ChatEntity?

}
