package rabbitProgram.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/rabbitmq/topic")
public class TopicController {

	@Autowired
	private TopicMessageSender messagesender;

	@RequestMapping("/send1")
	public void sendMessage1() {
		messagesender.sendMessage1();
	}

	@RequestMapping("/send2")
	public void sendMessage2() {
		messagesender.sendMessage2();
	}

	@RequestMapping("/send3")
	public void sendMessage3() {
		messagesender.sendMessage3();
	}

	@RequestMapping("/send4")
	public void sendMessage4() {
		messagesender.sendMessage4();
	}

	@RequestMapping("/send5")
	public void sendMessage5() {
		messagesender.sendMessage5();
	}

	@RequestMapping("/send6")
	public void sendMessage6() {
		messagesender.sendMessage6();
	}

	@RequestMapping("/send7")
	public void sendMessage7() {
		messagesender.sendMessage7();
	}

	@RequestMapping("/send8")
	public void sendMessage8() {
		messagesender.sendMessage8();
	}
}
