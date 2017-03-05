package com.gss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAutoConfiguration
@SpringBootApplication
@EnableMongoAuditing
@EnableAsync
public class GulatiSilkStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulatiSilkStoreApplication.class, args);
	}
}
