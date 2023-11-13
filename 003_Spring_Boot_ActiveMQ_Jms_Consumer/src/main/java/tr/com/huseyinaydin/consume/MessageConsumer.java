package tr.com.huseyinaydin.consume;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

//بسم الله الرحمن الرحيم

/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Spring Boot JMS and ActiveMQ
 *
 */

@Component
public class MessageConsumer {
	@JmsListener(destination = "demo")
	public void receiveMessage(String message) {
		System.out.println(message);
	}
}