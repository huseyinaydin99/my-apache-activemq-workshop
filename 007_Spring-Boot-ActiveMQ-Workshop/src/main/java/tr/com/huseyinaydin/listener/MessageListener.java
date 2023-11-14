package tr.com.huseyinaydin.listener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import tr.com.huseyinaydin.SpringBootActiveMQApplication;
import tr.com.huseyinaydin.domain.Product;
import tr.com.huseyinaydin.repositories.ProductRepository;

import java.util.Map;

/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Boot Examples
*
**/

@Component
public class MessageListener {

    private ProductRepository productRepository;

    private static final Logger log = LogManager.getLogger(MessageListener.class);

    public MessageListener(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @JmsListener(destination = SpringBootActiveMQApplication.PRODUCT_MESSAGE_QUEUE, containerFactory = "jmsFactory")
    public void receiveMessage(Map<String, String> message) {
        log.info("Received <" + message + ">");
        Long id = Long.valueOf(message.get("id"));
        Product product = productRepository.findById(id).orElse(null);
        product.setMessageReceived(true);
        product.setMessageCount(product.getMessageCount() + 1);
        productRepository.save(product);
        log.info("Mesaj alındı ve işlendi...");
    }
}