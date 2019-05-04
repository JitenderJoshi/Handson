package rabbitProgram.fanout;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class FanoutMessageListener {

	private static final Logger log = LoggerFactory.getLogger(FanoutMessageListener.class);

	@RabbitListener(queues = "${fanout.queue1.name}")
	public void receiveMessage1(final Message message) {
		log.info("Received message 1 as : {}", message.toString());
	}

	@RabbitListener(queues = "${fanout.queue2.name}")
	public void receiveMessage2(final Message message) {
		log.info("Received message 2 as : {}", message.toString());
	}

	@RabbitListener(queues = "${fanout.queue3.name}")
	public void receiveMessage3(final Message message) {
		log.info("Received message 3 as : {}", message.toString());
	}

}