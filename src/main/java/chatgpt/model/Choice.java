package chatgpt.model;

import lombok.Data;

@Data
public class Choice {

    private int index;

    private Message message;
}
