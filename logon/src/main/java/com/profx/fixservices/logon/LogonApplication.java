package com.profx.fixservices.logon;

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
public class LogonApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(LogonApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LogonApplication.class, args);
		
			
		      System.out.println("logon");
		      logger.info("logon");
		    
	}
	
	

}
