package com.example.consumingrest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumingRestApplication {

	private static final Logger log = LoggerFactory.getLogger(ConsumingRestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ConsumingRestApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			IP ip = restTemplate.getForObject(
					"http://echo.jsontest.com/value/zxc", IP.class);
			log.info(ip.getValue());

			IP ip2 = restTemplate.getForObject(
					"http://echo.jsontest.com/value/whatkindofvalueisthis", IP.class);
			log.info(ip2.getValue());

			Quote quote = restTemplate.getForObject(
					"http://localhost:8080/quote/random?id=507", Quote.class);

			log.info(quote.toString());

			Quote pathQuote = restTemplate.getForObject(
					"http://localhost:8080/quote/random/77", Quote.class);

			log.info(pathQuote.toString());


		};




	}
}