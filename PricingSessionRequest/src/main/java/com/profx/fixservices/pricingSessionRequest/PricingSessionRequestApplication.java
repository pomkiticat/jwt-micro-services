package com.profx.fixservices.pricingSessionRequest;

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
public class PricingSessionRequestApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(PricingSessionRequestApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(PricingSessionRequestApplication.class, args);
		
			
		      System.out.println("PricingSessionRequest");
		      logger.info("PricingSessionRequest");
		    
	}
	
	

}
