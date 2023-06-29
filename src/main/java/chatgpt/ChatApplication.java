package chatgpt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatApplication {

	/**
	 * Запуск в docker:
	 * @param args		//host.docker.internal:
	 */

	public static void main(String[] args) {
		SpringApplication.run(ChatApplication.class, args);
	}
}
