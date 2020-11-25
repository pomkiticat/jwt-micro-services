package com.profx.fixservices.marketDataRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication(exclude = {
		org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
		org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class}
)
@EnableEurekaClient
@EnableFeignClients
public class MarketDataRequestApplication {

	private static final Logger logger = LoggerFactory.getLogger(MarketDataRequestApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(MarketDataRequestApplication.class, args);
		
			
		      System.out.println("MarketDataRequest");
		      logger.info("marketdata request");
		    
	}
	
	

}
