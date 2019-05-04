package courseapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	TopicService topicservice;
	
	@RequestMapping(method=RequestMethod.GET, value="/topics")
	public List<Topic> getTopics() {
		return topicservice.getTopics();		
	}

}
