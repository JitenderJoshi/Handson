package rabbitProgram.direct;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rabbitProgram.ConfigReader;

@Service
public class DirectMessageSender {
	@Autowired
	private ConfigReader config;

	private static final Logger log = LoggerFactory.getLogger(DirectMessageSender.class);

	private final RabbitTemplate rabbitTemplate;

	public DirectMessageSender(final RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}

	/*
	 * Direct exchange will deliver a messages to the queues based on the message routing key. 
	 * In direct exchange, the message is routed to the queues whose binding key exactly matches with the routing key of the message.
	 * i.e.
	 * routing key of the message == binding key of Exchange-queue
	 * in this example queue3 &  queue4 are binded with exchange using same binding key,
	 * so a message with this routing key will be added to both queue3 & queue4
	 */

	public void sendMessage1() {
		final DirectMessage message = new DirectMessage("Hello, MessageNumber 1", new Random().nextInt(50));
		log.info("Sending message 1...");
		rabbitTemplate.convertAndSend(config.getDirectexchangename(), config.getDirectmsg1routingkey(), message);
	}
	
	public void sendMessage2() {
		final DirectMessage message = new DirectMessage("Hello, MessageNumber 2", new Random().nextInt(50));
		log.info("Sending message 2...");
		rabbitTemplate.convertAndSend(config.getDirectexchangename(), config.getDirectmsg2routingkey(), message);
	}
	
	public void sendMessage34() {
		final DirectMessage message = new DirectMessage("Hello, MessageNumber 34", new Random().nextInt(50));
		log.info("Sending message 34...");
		rabbitTemplate.convertAndSend(config.getDirectexchangename(), config.getDirectmsg34routingkey(), message);
	}
}
