package rabbitProgram.topic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rabbitProgram.ConfigReader;

@Service
public class TopicMessageSender {
	@Autowired
	private ConfigReader config;

	private static final Logger log = LoggerFactory.getLogger(TopicMessageSender.class);

	private final RabbitTemplate rabbitTemplate;

	public TopicMessageSender(final RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}

	/*
	 * topic exchange will perform a wildcard match 
	 * between 
	 * the routing key 
	 * and 
	 * the routing pattern of queue.
	 */
	public void sendMessage1() {
		final TopicMessage message = new TopicMessage("EMAIL EU STORE");
		log.info("Sending message 1... EMAIL EU STORE");
		rabbitTemplate.convertAndSend(config.getTopicexchangename(), config.getTopicmsg1routingkey(), message);
	}
	
	public void sendMessage2() {
		final TopicMessage message = new TopicMessage("PHONE EU HEADOFFICE");
		log.info("Sending message 2... PHONE EU HEADOFFICE");
		rabbitTemplate.convertAndSend(config.getTopicexchangename(), config.getTopicmsg2routingkey(), message);
	}
	
	public void sendMessage3() {
		final TopicMessage message = new TopicMessage("EMAIL IN STORE");
		log.info("Sending message 3... EMAIL IN STORE");
		rabbitTemplate.convertAndSend(config.getTopicexchangename(), config.getTopicmsg3routingkey(), message);
	}
	
	public void sendMessage4() {
		final TopicMessage message = new TopicMessage("PHONE IN HEADOFFICE");
		log.info("Sending message 4... PHONE IN HEADOFFICE");
		rabbitTemplate.convertAndSend(config.getTopicexchangename(), config.getTopicmsg4routingkey(), message);
	}
	
	public void sendMessage5() {
		final TopicMessage message = new TopicMessage("EMAIL US STORE");
		log.info("Sending message 5... EMAIL US STORE");
		rabbitTemplate.convertAndSend(config.getTopicexchangename(), config.getTopicmsg5routingkey(), message);
	}
	
	public void sendMessage6() {
		final TopicMessage message = new TopicMessage("PHONE US HEADOFFICE");
		log.info("Sending message 6... PHONE US HEADOFFICE");
		rabbitTemplate.convertAndSend(config.getTopicexchangename(), config.getTopicmsg6routingkey(), message);
	}
	
	public void sendMessage7() {
		final TopicMessage message = new TopicMessage("PHONE IN STORE");
		log.info("Sending message 7... PHONE IN STORE");
		rabbitTemplate.convertAndSend(config.getTopicexchangename(), config.getTopicmsg7routingkey(), message);
	}
	
	public void sendMessage8() {
		final TopicMessage message = new TopicMessage("EMAIL IN HEADOFFICE");
		log.info("Sending message 8... EMAIL IN HEADOFFICE");
		rabbitTemplate.convertAndSend(config.getTopicexchangename(), config.getTopicmsg8routingkey(), message);
	}
	
}
