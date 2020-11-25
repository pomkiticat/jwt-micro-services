package com.profx.fixservices.apigateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;



//@SpringBootApplication
@SpringBootApplication(exclude = {
		org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
		org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class}
)
@EnableZuulProxy
@EnableEurekaClient
@EnableFeignClients
public class APIGatewayApplication {
	private static final Logger logger = LoggerFactory.getLogger(APIGatewayApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(APIGatewayApplication.class, args);
		
			
		      System.out.println("APIGatewayApplication");
		      logger.info("APIGatewayApplication");
		    
	}
	
	 @Bean
	    public BCryptPasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder(); // For encrypting user password
	    }
	
	

}
