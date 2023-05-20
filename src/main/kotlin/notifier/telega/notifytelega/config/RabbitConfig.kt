package notifier.telega.notifytelega.config

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter
import org.springframework.amqp.support.converter.MessageConverter
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class RabbitConfig {

    @Bean
    fun producerJackson2MessageConverter(
        objectMapper: ObjectMapper
    ): MessageConverter {
        return Jackson2JsonMessageConverter(objectMapper)
    }

}
