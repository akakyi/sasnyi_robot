package notifier.telega.notifytelega.dataproviders.relational.chats

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ChatRepository : JpaRepository<ChatEntity, UUID>
