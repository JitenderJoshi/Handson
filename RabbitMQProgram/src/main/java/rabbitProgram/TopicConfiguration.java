package rabbitProgram;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TopicConfiguration {
	
	@Autowired
	private ConfigReader config;

	/* Creating a bean for the Topic exchange */
	@Bean
	public TopicExchange getTopicExchange() {
		return new TopicExchange(config.getTopicexchangename());
	}

	/* Creating a bean for the topic exchange queues */
	@Bean
	public Queue getTopicExchangeQueue1() {
		return new Queue(config.getTopicqueue1name());
	}
	@Bean
	public Queue getTopicExchangeQueue2() {
		return new Queue(config.getTopicqueue2name());
	}
	@Bean
	public Queue getTopicExchangeQueue3() {
		return new Queue(config.getTopicqueue3name());
	}
	@Bean
	public Queue getTopicExchangeQueue4() {
		return new Queue(config.getTopicqueue4name());
	}
	@Bean
	public Queue getTopicExchangeQueue5() {
		return new Queue(config.getTopicqueue5name());
	}
	@Bean
	public Queue getTopicExchangeQueue6() {
		return new Queue(config.getTopicqueue6name());
	}
	
	/* Binding between topic exchange and Queues using binding patterns */
	@Bean
	public Binding declareBindingTopicExchangeQueue1() {
		return BindingBuilder.bind(getTopicExchangeQueue1()).to(getTopicExchange()).with(config.getTopicqueue1routingpattern());
	}

	@Bean
	public Binding declareBindingTopicExchangeQueue2() {
		return BindingBuilder.bind(getTopicExchangeQueue2()).to(getTopicExchange()).with(config.getTopicqueue2routingpattern());
	}

	@Bean
	public Binding declareBindingTopicExchangeQueue3() {
		return BindingBuilder.bind(getTopicExchangeQueue3()).to(getTopicExchange()).with(config.getTopicqueue3routingpattern());
	}

	@Bean
	public Binding declareBindingTopicExchangeQueue4() {
		return BindingBuilder.bind(getTopicExchangeQueue4()).to(getTopicExchange()).with(config.getTopicqueue4routingpattern());
	}

	@Bean
	public Binding declareBindingTopicExchangeQueue5() {
		return BindingBuilder.bind(getTopicExchangeQueue5()).to(getTopicExchange()).with(config.getTopicqueue5routingpattern());
	}

	@Bean
	public Binding declareBindingTopicExchangeQueue6() {
		return BindingBuilder.bind(getTopicExchangeQueue6()).to(getTopicExchange()).with(config.getTopicqueue6routingpattern());
	}

}
