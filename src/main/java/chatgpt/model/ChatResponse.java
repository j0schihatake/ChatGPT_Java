package chatgpt.model;

import lombok.Data;

import java.util.List;

@Data
public class ChatResponse {

    private List<Choice> choices;
}