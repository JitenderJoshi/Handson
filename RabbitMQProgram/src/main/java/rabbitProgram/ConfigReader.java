package rabbitProgram;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class ConfigReader {
	
	/** 
	 * DIRECT EXCHANGE 
	 **/

	@Value("${direct.exchange.name}")
	private String directexchangename;

	@Value("${direct.queue1.name}")
	private String directqueue1name;

	@Value("${direct.queue1.routing.key}")
	private String directqueue1routingkey;

	@Value("${direct.queue2.name}")
	private String directqueue2name;

	@Value("${direct.queue2.routing.key}")
	private String directqueue2routingkey;

	@Value("${direct.queue3.name}")
	private String directqueue3name;

	@Value("${direct.queue4.name}")
	private String directqueue4name;

	@Value("${direct.queue34.routing.key}")
	private String directqueue34routingkey;

	@Value("${direct.queue1.binding.key}")
	private String directqueue1bindingkey;

	@Value("${direct.queue2.binding.key}")
	private String directqueue2bindingkey;

	@Value("${direct.queue3.binding.key}")
	private String directqueue3bindingkey;

	@Value("${direct.queue4.binding.key}")
	private String directqueue4bindingkey;

	public String getDirectexchangename() {
		return directexchangename;
	}

	public void setDirectexchangename(String directexchangename) {
		this.directexchangename = directexchangename;
	}

	public String getDirectqueue1name() {
		return directqueue1name;
	}

	public void setDirectqueue1name(String directqueue1name) {
		this.directqueue1name = directqueue1name;
	}

	public String getDirectqueue1routingkey() {
		return directqueue1routingkey;
	}

	public void setDirectqueue1routingkey(String directqueue1routingkey) {
		this.directqueue1routingkey = directqueue1routingkey;
	}

	public String getDirectqueue2name() {
		return directqueue2name;
	}

	public void setDirectqueue2name(String directqueue2name) {
		this.directqueue2name = directqueue2name;
	}

	public String getDirectqueue2routingkey() {
		return directqueue2routingkey;
	}

	public void setDirectqueue2routingkey(String directqueue2routingkey) {
		this.directqueue2routingkey = directqueue2routingkey;
	}

	public String getDirectqueue3name() {
		return directqueue3name;
	}

	public void setDirectqueue3name(String directqueue3name) {
		this.directqueue3name = directqueue3name;
	}

	public String getDirectqueue4name() {
		return directqueue4name;
	}

	public void setDirectqueue4name(String directqueue4name) {
		this.directqueue4name = directqueue4name;
	}

	public String getDirectqueue34routingkey() {
		return directqueue34routingkey;
	}

	public void setDirectqueue34routingkey(String directqueue34routingkey) {
		this.directqueue34routingkey = directqueue34routingkey;
	}
	
	public String getDirectqueue1bindingkey() {
		return directqueue1bindingkey;
	}

	public void setDirectqueue1bindingkey(String directqueue1bindingkey) {
		this.directqueue1bindingkey = directqueue1bindingkey;
	}

	public String getDirectqueue2bindingkey() {
		return directqueue2bindingkey;
	}

	public void setDirectqueue2bindingkey(String directqueue2bindingkey) {
		this.directqueue2bindingkey = directqueue2bindingkey;
	}

	public String getDirectqueue3bindingkey() {
		return directqueue3bindingkey;
	}

	public void setDirectqueue3bindingkey(String directqueue3bindingkey) {
		this.directqueue3bindingkey = directqueue3bindingkey;
	}

	public String getDirectqueue4bindingkey() {
		return directqueue4bindingkey;
	}

	public void setDirectqueue4bindingkey(String directqueue4bindingkey) {
		this.directqueue4bindingkey = directqueue4bindingkey;
	}



	/** 
	 * FANOUT EXCHANGE 
	 **/

	@Value("${fanout.exchange.name}")
	private String fanoutexchangename;

	@Value("${fanout.queue1.name}")
	private String fanoutqueue1name;

	@Value("${fanout.queue2.name}")
	private String fanoutqueue2name;

	@Value("${fanout.queue3.name}")
	private String fanoutqueue3name;

	public String getFanoutexchangename() {
		return fanoutexchangename;
	}

	public void setFanoutexchangename(String fanoutexchangename) {
		this.fanoutexchangename = fanoutexchangename;
	}

	public String getFanoutqueue1name() {
		return fanoutqueue1name;
	}

	public void setFanoutqueue1name(String fanoutqueue1name) {
		this.fanoutqueue1name = fanoutqueue1name;
	}

	public String getFanoutqueue2name() {
		return fanoutqueue2name;
	}

	public void setFanoutqueue2name(String fanoutqueue2name) {
		this.fanoutqueue2name = fanoutqueue2name;
	}

	public String getFanoutqueue3name() {
		return fanoutqueue3name;
	}

	public void setFanoutqueue3name(String fanoutqueue3name) {
		this.fanoutqueue3name = fanoutqueue3name;
	}


}
