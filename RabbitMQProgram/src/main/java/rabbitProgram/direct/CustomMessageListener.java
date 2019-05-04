package rabbitProgram.direct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class CustomMessageListener {

	private static final Logger log = LoggerFactory.getLogger(CustomMessageListener.class);

	@RabbitListener(queues = "${direct.queue1.name}")
	public void receiveMessage1(final Message message) {
		log.info("Received message 1 as : {}", message.toString());
	}

	@RabbitListener(queues = "${direct.queue2.name}")
	public void receiveMessage2(final Message message) {
		log.info("Received message 2 as : {}", message.toString());
	}
	
	@RabbitListener(queues = "${direct.queue3.name}")
	public void receiveMessage3(final Message message) {
		log.info("Received message 3 as : {}", message.toString());
	}
	
	@RabbitListener(queues = "${direct.queue4.name}")
	public void receiveMessage4(final Message message) {
		log.info("Received message 4 as : {}", message.toString());
	}

}