package chatgpt.model.response;

import chatgpt.model.Choice;
import lombok.Data;

import java.util.List;

@Data
public class ChatResponse {

    private Error error;

    private List<Choice> choices;
}