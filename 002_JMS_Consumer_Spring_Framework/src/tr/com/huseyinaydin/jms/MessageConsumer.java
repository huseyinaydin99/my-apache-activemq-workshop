package tr.com.huseyinaydin.jms;

import java.io.IOException;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import tr.com.huseyinaydin.pojo.Products;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class MessageConsumer {

	@JmsListener(destination = "demo")
    public void receiveMessage(String messageStr) throws JsonParseException, JsonMappingException, IOException {
		System.out.println(messageStr);
		ObjectMapper mapper = new ObjectMapper();
        Products product = mapper.readValue(messageStr, Products.class);
        System.out.println(product.getName());
	}
}
