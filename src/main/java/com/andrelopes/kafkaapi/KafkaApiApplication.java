package com.andrelopes.kafkaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class KafkaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaApiApplication.class, args);
	}

}
