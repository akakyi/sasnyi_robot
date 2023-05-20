package notifier.telega.notifytelega.service.dto

import org.telegram.telegrambots.meta.api.objects.Update

data class ProcessChatInvasionInDto(
    val update: Update
)
