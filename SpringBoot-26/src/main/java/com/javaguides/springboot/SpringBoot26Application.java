package com.javaguides.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.openfeign.EnableFeignClients;
//import com.javaguides.springboot.client;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SpringBoot26Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot26Application.class, args);
	}

}
