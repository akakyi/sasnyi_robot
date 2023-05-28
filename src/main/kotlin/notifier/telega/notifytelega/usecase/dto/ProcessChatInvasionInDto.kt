package notifier.telega.notifytelega.usecase.dto

import org.telegram.telegrambots.meta.api.objects.Update

data class ProcessChatInvasionInDto(
    val update: Update
)
