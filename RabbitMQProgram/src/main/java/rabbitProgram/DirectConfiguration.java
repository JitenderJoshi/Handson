package rabbitProgram;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DirectConfiguration {
	
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

	/* Binding between direct exchange and Queue1 using binding key */
	@Bean
	public Binding declareBindingDirectExchangeQueue1() {
		return BindingBuilder.bind(getDirectExchangeQueue1()).to(getDirectExchange()).with(config.getDirectqueue1bindingkey());
	}

	/* Creating a bean for the direct exchange queue 2 */
	@Bean
	public Queue getDirectExchangeQueue2() {
		return new Queue(config.getDirectqueue2name());
	}

	/* Binding between direct exchange and Queue2 using binding key */
	@Bean
	public Binding declareBindingDirectExchangeQueue2() {
		return BindingBuilder.bind(getDirectExchangeQueue2()).to(getDirectExchange()).with(config.getDirectqueue2bindingkey());
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

	/* Binding between direct exchange and Queue3 using binding key */
	@Bean
	public Binding declareBindingDirectExchangeQueue3() {
		return BindingBuilder.bind(getDirectExchangeQueue3()).to(getDirectExchange()).with(config.getDirectqueue3bindingkey());
	}

	/* Binding between direct exchange and Queue4 using binding key */
	@Bean
	public Binding declareBindingDirectExchangeQueue4() {
		return BindingBuilder.bind(getDirectExchangeQueue4()).to(getDirectExchange()).with(config.getDirectqueue4bindingkey());
	}

}
