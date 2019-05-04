package rabbitProgram;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RabbitMqProgramApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitMqProgramApplication.class, args);
	}

	@Autowired
	private ConfigReader config;

	/* Creating a bean for the direct exchange */
	@Bean
	public DirectExchange getDirectExchange() {
		return new DirectExchange(config.getDirectexchangename());
	}

	/* Creating a bean for the direct exchange queue 1 */
	@Bean
	public Queue getDirectExchangeQueue1() {
		return new Queue(config.getDirectqueue1name());
	}

	/* Binding between direct exchange and Queue1 using routing key */
	@Bean
	public Binding declareBindingDirectExchangeQueue1() {
		return BindingBuilder.bind(getDirectExchangeQueue1()).to(getDirectExchange()).with(config.getDirectqueue1routingkey());
	}

	/* Creating a bean for the direct exchange queue 2 */
	@Bean
	public Queue getDirectExchangeQueue2() {
		return new Queue(config.getDirectqueue2name());
	}

	/* Binding between direct exchange and Queue2 using routing key */
	@Bean
	public Binding declareBindingDirectExchangeQueue2() {
		return BindingBuilder.bind(getDirectExchangeQueue2()).to(getDirectExchange()).with(config.getDirectqueue2routingkey());
	}

	/* Creating a bean for the direct exchange queue 3 */
	@Bean
	public Queue getDirectExchangeQueue3() {
		return new Queue(config.getDirectqueue3name());
	}

	/* Creating a bean for the direct exchange queue 4 */
	@Bean
	public Queue getDirectExchangeQueue4() {
		return new Queue(config.getDirectqueue4name());
	}

	/* Binding between direct exchange and Queue3 using routing key */
	@Bean
	public Binding declareBindingDirectExchangeQueue3() {
		return BindingBuilder.bind(getDirectExchangeQueue3()).to(getDirectExchange()).with(config.getDirectqueue34routingkey());
	}

	/* Binding between direct exchange and Queue4 using routing key */
	@Bean
	public Binding declareBindingDirectExchangeQueue4() {
		return BindingBuilder.bind(getDirectExchangeQueue4()).to(getDirectExchange()).with(config.getDirectqueue34routingkey());
	}

	/* Bean for rabbitTemplate */
	@Bean
	public RabbitTemplate rabbitTemplate(final ConnectionFactory connectionFactory) {
		final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
		rabbitTemplate.setMessageConverter(producerJackson2MessageConverter());
		return rabbitTemplate;
	}

	@Bean
	public Jackson2JsonMessageConverter producerJackson2MessageConverter() {
		return new Jackson2JsonMessageConverter();
	}

}
