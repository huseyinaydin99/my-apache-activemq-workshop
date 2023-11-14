package tr.com.huseyinaydin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;

import javax.jms.ConnectionFactory;

/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Boot Examples
*
**/

@SpringBootApplication
@EnableJms
public class SpringBootActiveMQApplication {

    public final static String PRODUCT_MESSAGE_QUEUE = "product-message-queue";

    @Bean
    public JmsListenerContainerFactory<?> jmsFactory(ConnectionFactory connectionFactory,
      DefaultJmsListenerContainerFactoryConfigurer configurer) {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        configurer.configure(factory, connectionFactory);
        return factory;
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
          SpringApplication.run(SpringBootActiveMQApplication.class, args);
    }
}