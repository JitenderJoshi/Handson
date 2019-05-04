package rabbitProgram.fanout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/rabbitmq/fanout")
public class FanoutController {

	@Autowired
	private FanoutMessageSender messagesender;

	@RequestMapping("/send1")
	public void sendMessagetoQueue1() {
		messagesender.sendMessage1();
	}

	@RequestMapping("/send2")
	public void sendMessagetoQueue2() {
		messagesender.sendMessage2();
	}

	@RequestMapping("/send3")
	public void sendMessagetoQueue3() {
		messagesender.sendMessage3();
	}

}
