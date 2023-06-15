package com.microJwt.productService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class productServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(productServiceApplication.class, args);
	}

}
