package tr.com.huseyinaydin.produce;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

//بسم الله الرحمن الرحيم

/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Apache ActiveMQ.
 *
 */

public class Publisher {

	public static void main(String[] args) {
		ConnectionFactory factory = new ActiveMQConnectionFactory("admin", "admin", 
				"tcp://localhost:61616");
		try {
			Connection connection = factory.createConnection();
			Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			Destination destination = session.createQueue("demo");
			String[] messages = {"Selam", "Merhaba", "Nöğrüyon",
					"Nassın"};
			MessageProducer producer = session.createProducer(destination);
			for (String message : messages) {
				TextMessage textMessage = session.createTextMessage(message);
				producer.send(textMessage);
			}
			System.out.println("Mesaj kuyruğa iletildi.");
			session.close();
			connection.close();
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
}