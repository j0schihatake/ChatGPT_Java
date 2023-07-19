package chatgpt.controller;

import chatgpt.config.OpenAIConfig;
import chatgpt.model.ChatRequest;
import chatgpt.model.response.ChatResponse;
import chatgpt.model.RequestDTO;
import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
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

    @PostMapping("/chat")
    public String chat(@RequestBody RequestDTO requestDTO) {

        ChatRequest request = new ChatRequest(openAIConfig.getModel(), requestDTO.getMessage());

        ChatResponse response = restTemplate.postForObject(openAIConfig.getApiUrl(), request, ChatResponse.class);

        if (response == null || response.getChoices() == null || response.getChoices().isEmpty()) {
            return "No response";
        }
        return response.getChoices().get(0).getMessage().getContent();
    }

    /*
    {

    "error": {
        "message": "You exceeded your current quota, please check your plan and billing details.",
        "type": "insufficient_quota",
        "param": null,
        "code": null
    }
}
     */
}
