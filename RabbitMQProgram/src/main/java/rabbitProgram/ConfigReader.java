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

	@Value("${direct.queue2.name}")
	private String directqueue2name;

	@Value("${direct.queue3.name}")
	private String directqueue3name;

	@Value("${direct.queue4.name}")
	private String directqueue4name;

	@Value("${direct.queue1.binding.key}")
	private String directqueue1bindingkey;

	@Value("${direct.queue2.binding.key}")
	private String directqueue2bindingkey;

	@Value("${direct.queue3.binding.key}")
	private String directqueue3bindingkey;

	@Value("${direct.queue4.binding.key}")
	private String directqueue4bindingkey;

	@Value("${direct.msg1.routing.key}")
	private String directmsg1routingkey;

	@Value("${direct.msg2.routing.key}")
	private String directmsg2routingkey;

	@Value("${direct.msg34.routing.key}")
	private String directmsg34routingkey;

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

	/** 
	 * TOPIC EXCHANGE 
	 **/

	@Value("${topic.exchange.name}")
	private String topicexchangename;

	@Value("${topic.queue1.name}")
	private String topicqueue1name;

	@Value("${topic.queue2.name}")
	private String topicqueue2name;

	@Value("${topic.queue3.name}")
	private String topicqueue3name;

	@Value("${topic.queue4.name}")
	private String topicqueue4name;

	@Value("${topic.queue5.name}")
	private String topicqueue5name;

	@Value("${topic.queue6.name}")
	private String topicqueue6name;

	@Value("${topic.queue1.routing.pattern}")
	private String topicqueue1routingpattern;

	@Value("${topic.queue2.routing.pattern}")
	private String topicqueue2routingpattern;

	@Value("${topic.queue3.routing.pattern}")
	private String topicqueue3routingpattern;

	@Value("${topic.queue4.routing.pattern}")
	private String topicqueue4routingpattern;

	@Value("${topic.queue5.routing.pattern}")
	private String topicqueue5routingpattern;

	@Value("${topic.queue6.routing.pattern}")
	private String topicqueue6routingpattern;

	@Value("${topic.msg1.routing.key}")
	private String topicmsg1routingkey;

	@Value("${topic.msg2.routing.key}")
	private String topicmsg2routingkey;

	@Value("${topic.msg3.routing.key}")
	private String topicmsg3routingkey;

	@Value("${topic.msg4.routing.key}")
	private String topicmsg4routingkey;

	@Value("${topic.msg5.routing.key}")
	private String topicmsg5routingkey;

	@Value("${topic.msg6.routing.key}")
	private String topicmsg6routingkey;

	@Value("${topic.msg7.routing.key}")
	private String topicmsg7routingkey;

	@Value("${topic.msg8.routing.key}")
	private String topicmsg8routingkey;

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

	public String getDirectqueue2name() {
		return directqueue2name;
	}

	public void setDirectqueue2name(String directqueue2name) {
		this.directqueue2name = directqueue2name;
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

	public String getDirectmsg1routingkey() {
		return directmsg1routingkey;
	}

	public void setDirectmsg1routingkey(String directmsg1routingkey) {
		this.directmsg1routingkey = directmsg1routingkey;
	}

	public String getDirectmsg2routingkey() {
		return directmsg2routingkey;
	}

	public void setDirectmsg2routingkey(String directmsg2routingkey) {
		this.directmsg2routingkey = directmsg2routingkey;
	}

	public String getDirectmsg34routingkey() {
		return directmsg34routingkey;
	}

	public void setDirectmsg34routingkey(String directmsg34routingkey) {
		this.directmsg34routingkey = directmsg34routingkey;
	}

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

	public String getTopicexchangename() {
		return topicexchangename;
	}

	public void setTopicexchangename(String topicexchangename) {
		this.topicexchangename = topicexchangename;
	}

	public String getTopicqueue1name() {
		return topicqueue1name;
	}

	public void setTopicqueue1name(String topicqueue1name) {
		this.topicqueue1name = topicqueue1name;
	}

	public String getTopicqueue2name() {
		return topicqueue2name;
	}

	public void setTopicqueue2name(String topicqueue2name) {
		this.topicqueue2name = topicqueue2name;
	}

	public String getTopicqueue3name() {
		return topicqueue3name;
	}

	public void setTopicqueue3name(String topicqueue3name) {
		this.topicqueue3name = topicqueue3name;
	}

	public String getTopicqueue4name() {
		return topicqueue4name;
	}

	public void setTopicqueue4name(String topicqueue4name) {
		this.topicqueue4name = topicqueue4name;
	}

	public String getTopicqueue5name() {
		return topicqueue5name;
	}

	public void setTopicqueue5name(String topicqueue5name) {
		this.topicqueue5name = topicqueue5name;
	}

	public String getTopicqueue6name() {
		return topicqueue6name;
	}

	public void setTopicqueue6name(String topicqueue6name) {
		this.topicqueue6name = topicqueue6name;
	}

	public String getTopicqueue1routingpattern() {
		return topicqueue1routingpattern;
	}

	public void setTopicqueue1routingpattern(String topicqueue1routingpattern) {
		this.topicqueue1routingpattern = topicqueue1routingpattern;
	}

	public String getTopicqueue2routingpattern() {
		return topicqueue2routingpattern;
	}

	public void setTopicqueue2routingpattern(String topicqueue2routingpattern) {
		this.topicqueue2routingpattern = topicqueue2routingpattern;
	}

	public String getTopicqueue3routingpattern() {
		return topicqueue3routingpattern;
	}

	public void setTopicqueue3routingpattern(String topicqueue3routingpattern) {
		this.topicqueue3routingpattern = topicqueue3routingpattern;
	}

	public String getTopicqueue4routingpattern() {
		return topicqueue4routingpattern;
	}

	public void setTopicqueue4routingpattern(String topicqueue4routingpattern) {
		this.topicqueue4routingpattern = topicqueue4routingpattern;
	}

	public String getTopicqueue5routingpattern() {
		return topicqueue5routingpattern;
	}

	public void setTopicqueue5routingpattern(String topicqueue5routingpattern) {
		this.topicqueue5routingpattern = topicqueue5routingpattern;
	}

	public String getTopicqueue6routingpattern() {
		return topicqueue6routingpattern;
	}

	public void setTopicqueue6routingpattern(String topicqueue6routingpattern) {
		this.topicqueue6routingpattern = topicqueue6routingpattern;
	}

	public String getTopicmsg1routingkey() {
		return topicmsg1routingkey;
	}

	public void setTopicmsg1routingkey(String topicmsg1routingkey) {
		this.topicmsg1routingkey = topicmsg1routingkey;
	}

	public String getTopicmsg2routingkey() {
		return topicmsg2routingkey;
	}

	public void setTopicmsg2routingkey(String topicmsg2routingkey) {
		this.topicmsg2routingkey = topicmsg2routingkey;
	}

	public String getTopicmsg3routingkey() {
		return topicmsg3routingkey;
	}

	public void setTopicmsg3routingkey(String topicmsg3routingkey) {
		this.topicmsg3routingkey = topicmsg3routingkey;
	}

	public String getTopicmsg4routingkey() {
		return topicmsg4routingkey;
	}

	public void setTopicmsg4routingkey(String topicmsg4routingkey) {
		this.topicmsg4routingkey = topicmsg4routingkey;
	}

	public String getTopicmsg5routingkey() {
		return topicmsg5routingkey;
	}

	public void setTopicmsg5routingkey(String topicmsg5routingkey) {
		this.topicmsg5routingkey = topicmsg5routingkey;
	}

	public String getTopicmsg6routingkey() {
		return topicmsg6routingkey;
	}

	public void setTopicmsg6routingkey(String topicmsg6routingkey) {
		this.topicmsg6routingkey = topicmsg6routingkey;
	}

	public String getTopicmsg7routingkey() {
		return topicmsg7routingkey;
	}

	public void setTopicmsg7routingkey(String topicmsg7routingkey) {
		this.topicmsg7routingkey = topicmsg7routingkey;
	}

	public String getTopicmsg8routingkey() {
		return topicmsg8routingkey;
	}

	public void setTopicmsg8routingkey(String topicmsg8routingkey) {
		this.topicmsg8routingkey = topicmsg8routingkey;
	}

}
