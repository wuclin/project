package com.example.apigateway3333;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ApiGateway3333Application {

	public static void main(String[] args) {
		SpringApplication.run(ApiGateway3333Application.class, args);
	}

}
