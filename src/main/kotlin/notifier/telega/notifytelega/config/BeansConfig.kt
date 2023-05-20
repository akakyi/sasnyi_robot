package notifier.telega.notifytelega.config

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BeansConfig {

    @Bean
    fun objectMapper() = ObjectMapper()

}
