package chatgpt.controller;

import chatgpt.config.OpenAIConfig;
import chatgpt.model.ChatRequest;
import chatgpt.model.ChatResponse;
import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Data
@RestController
public class ChatController {

    @Qualifier("openaiRestTemplate")
    private final RestTemplate restTemplate;

    private final OpenAIConfig openAIConfig;

    @GetMapping("/chat")
    public String chat(@RequestParam String prompt) {

        ChatRequest request = new ChatRequest(openAIConfig.getModel(), prompt);

        ChatResponse response = restTemplate.postForObject(openAIConfig.getApiUrl(), request, ChatResponse.class);

        if (response == null || response.getChoices() == null || response.getChoices().isEmpty()) {
            return "No response";
        }
        return response.getChoices().get(0).getMessage().getContent();
    }
}
