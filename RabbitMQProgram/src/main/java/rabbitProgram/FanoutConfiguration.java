package rabbitProgram;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FanoutConfiguration {
	
	@Autowired
	private ConfigReader config;

	/* Creating a bean for the fanout exchange */
	@Bean
	public FanoutExchange getFanoutExchange() {
		return new FanoutExchange(config.getFanoutexchangename());
	}

	/* Creating a bean for the fanout exchange queue 1 */
	@Bean
	public Queue getFanoutExchangeQueue1() {
		return new Queue(config.getFanoutqueue1name());
	}

	/* Binding between fanout exchange and Queue1 with no routing key */
	@Bean
	public Binding declareBindingFanoutExchangeQueue1() {
		return BindingBuilder.bind(getFanoutExchangeQueue1()).to(getFanoutExchange());
	}

	/* Creating a bean for the fanout exchange queue 2 */
	@Bean
	public Queue getFanoutExchangeQueue2() {
		return new Queue(config.getFanoutqueue2name());
	}

	/* Binding between fanout exchange and Queue2 with no routing key */
	@Bean
	public Binding declareBindingFanoutExchangeQueue2() {
		return BindingBuilder.bind(getFanoutExchangeQueue2()).to(getFanoutExchange());
	}

	/* Creating a bean for the fanout exchange queue 3 */
	@Bean
	public Queue getFanoutExchangeQueue3() {
		return new Queue(config.getFanoutqueue3name());
	}

	/* Binding between fanout exchange and Queue3 with no routing key */
	@Bean
	public Binding declareBindingFanoutExchangeQueue3() {
		return BindingBuilder.bind(getFanoutExchangeQueue3()).to(getFanoutExchange());
	}
}
