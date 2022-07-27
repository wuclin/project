package com.example.eurekaserver8003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer8003Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServer8003Application.class, args);
	}

}
