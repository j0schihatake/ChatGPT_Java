package chatgpt.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ChatRequest {

    private int n;

    private String model;

    private double temperature;

    private List<Message> messages;

    public ChatRequest(String model, String prompt) {

        this.model = model;

        this.messages = new ArrayList<>();

        this.messages.add(new Message("user", prompt));
    }
}