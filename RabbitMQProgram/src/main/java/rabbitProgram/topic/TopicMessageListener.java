package rabbitProgram.topic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class TopicMessageListener {

	private static final Logger log = LoggerFactory.getLogger(TopicMessageListener.class);

	@RabbitListener(queues = "${topic.queue1.name}")
	public void receiveMessage1(final Message message) {
		log.info("Received message on queue 1 as : {}", message.toString());
	}

	@RabbitListener(queues = "${topic.queue2.name}")
	public void receiveMessage2(final Message message) {
		log.info("Received message on queue 2 as : {}", message.toString());
	}

	@RabbitListener(queues = "${topic.queue3.name}")
	public void receiveMessage3(final Message message) {
		log.info("Received message on queue 3 as : {}", message.toString());
	}

	@RabbitListener(queues = "${topic.queue4.name}")
	public void receiveMessage4(final Message message) {
		log.info("Received message on queue 4 as : {}", message.toString());
	}

	@RabbitListener(queues = "${topic.queue5.name}")
	public void receiveMessage5(final Message message) {
		log.info("Received message on queue 5 as : {}", message.toString());
	}

	@RabbitListener(queues = "${topic.queue6.name}")
	public void receiveMessage6(final Message message) {
		log.info("Received message on queue 6 as : {}", message.toString());
	}
}