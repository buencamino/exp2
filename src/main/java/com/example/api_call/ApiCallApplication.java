package com.example.api_call;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class ApiCallApplication {

	private static final Logger log = LoggerFactory.getLogger(ApiCallApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ApiCallApplication.class, args);
	}
/*
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	@Profile("!test")
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			List<image> img = Collections.singletonList(restTemplate.getForObject(
					"https://api.thecatapi.com/v1/images/search", image.class));
			//log.info(image.toString());
		};
	}
	*/
	//update delete hibernate
		// jms
		// batch
		// connect with angular
		// tomcat server (?? not needed)
		// services, bean configuration
		// face recog
}
