package com.cricket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CricketApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(CricketApplication.class);

	
	public static void main(String[] args) {
		SpringApplication.run(CricketApplication.class, args);
		System.out.println("hi");
		
		LOGGER.error("Message logged at ERROR level");
		LOGGER.warn("Message logged at WARN level");
		LOGGER.info("Message logged at INFO level");
		LOGGER.debug("Message logged at DEBUG level");
		
	}

}
