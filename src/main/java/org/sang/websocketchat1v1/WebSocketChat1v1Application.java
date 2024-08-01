package org.sang.websocketchat1v1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class WebSocketChat1v1Application {

	public static void main(String[] args) {
		SpringApplication.run(WebSocketChat1v1Application.class, args);
	}

}
