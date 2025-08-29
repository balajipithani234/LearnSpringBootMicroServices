package com.javaguides.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudConfigSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigSpringBootApplication.class, args);
	}

}
