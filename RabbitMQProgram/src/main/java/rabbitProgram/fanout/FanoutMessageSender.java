package rabbitProgram.fanout;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rabbitProgram.ConfigReader;

@Service
public class FanoutMessageSender {
	@Autowired
	private ConfigReader config;

	private static final Logger log = LoggerFactory.getLogger(FanoutMessageSender.class);

	private final RabbitTemplate rabbitTemplate;

	public FanoutMessageSender(final RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}

	/*
	 * fanout exchange will route messages to all of the queues that are bound to it.
	 * so a message will be added to all the queues
	 */

	public void sendMessage1() {
		final FanoutMessage message = new FanoutMessage("Hello, MessageNumber 1", new Random().nextInt(50));
		log.info("Sending message 1...");
		rabbitTemplate.convertAndSend(config.getFanoutexchangename(), "", message);
	}
	
	public void sendMessage2() {
		final FanoutMessage message = new FanoutMessage("Hello, MessageNumber 2", new Random().nextInt(50));
		log.info("Sending message 2...");
		rabbitTemplate.convertAndSend(config.getFanoutexchangename(), "", message);
	}
	
	public void sendMessage3() {
		final FanoutMessage message = new FanoutMessage("Hello, MessageNumber 23", new Random().nextInt(50));
		log.info("Sending message 23...");
		rabbitTemplate.convertAndSend(config.getFanoutexchangename(), "", message);
	}
}
