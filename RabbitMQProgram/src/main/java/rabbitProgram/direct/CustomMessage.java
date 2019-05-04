package rabbitProgram.direct;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomMessage implements Serializable {

	private static final long serialVersionUID = 6768104175656791714L;
	
	private final String text;
	private final int priority;

	public CustomMessage(@JsonProperty("text") String text,
			@JsonProperty("priority") int priority) {
		this.text = text;
		this.priority = priority;
	}

	public String getText() {
		return text;
	}

	public int getPriority() {
		return priority;
	}

	@Override
	public String toString() {
		return "CustomMessage{" +
				"text='" + text + '\'' +
				", priority=" + priority +
				'}';
	}
}
