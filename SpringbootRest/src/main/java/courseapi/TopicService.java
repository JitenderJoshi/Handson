package courseapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("SPRING", "Spring Framework", "Spring Framework description"),
			new Topic("JAVA", "Core Java", "Core Java description"),
			new Topic("JAVASCRIPT", "JavaScript", "Javascript description")
			));

	public List<Topic> getTopics() {
		return topics;
	}

}
