package rabbitProgram.direct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/rabbitmq")
public class DirectController {

	@Autowired
	private CustomMessageSender messagesender;

	@RequestMapping("/send1")
	public void sendMessagetoQueue1() {
		messagesender.sendMessage1();
	}

	@RequestMapping("/send2")
	public void sendMessagetoQueue2() {
		messagesender.sendMessage2();
	}

	@RequestMapping("/send34")
	public void sendMessagetoQueue34() {
		messagesender.sendMessage34();
	}

}
