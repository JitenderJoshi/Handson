package rabbitProgram.topic;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TopicMessage implements Serializable {

	private static final long serialVersionUID = 6768104175656791714L;
	
	private final String text;

	public TopicMessage(@JsonProperty("text") String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	@Override
	public String toString() {
		return "CustomMessage{" +
				"text='" + text + '\'' +
				'}';
	}
}
