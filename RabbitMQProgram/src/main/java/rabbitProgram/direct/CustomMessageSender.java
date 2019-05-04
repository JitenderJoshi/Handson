package rabbitProgram.direct;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rabbitProgram.ConfigReader;

@Service
public class CustomMessageSender {
	@Autowired
	private ConfigReader config;

	private static final Logger log = LoggerFactory.getLogger(CustomMessageSender.class);

	private final RabbitTemplate rabbitTemplate;

	public CustomMessageSender(final RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}

	public void sendMessage1() {
		final CustomMessage message = new CustomMessage("Hello, MessageNumber 1", new Random().nextInt(50));
		log.info("Sending message 1...");
		rabbitTemplate.convertAndSend(config.getDirectexchangename(), config.getDirectqueue1routingkey(), message);
	}
	
	public void sendMessage2() {
		final CustomMessage message = new CustomMessage("Hello, MessageNumber 2", new Random().nextInt(50));
		log.info("Sending message 2...");
		rabbitTemplate.convertAndSend(config.getDirectexchangename(), config.getDirectqueue2routingkey(), message);
	}
	
	public void sendMessage34() {
		final CustomMessage message = new CustomMessage("Hello, MessageNumber 34", new Random().nextInt(50));
		log.info("Sending message 34...");
		rabbitTemplate.convertAndSend(config.getDirectexchangename(), config.getDirectqueue34routingkey(), message);
	}
}
