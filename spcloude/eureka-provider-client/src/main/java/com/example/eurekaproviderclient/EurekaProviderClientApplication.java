package com.example.eurekaproviderclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaProviderClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaProviderClientApplication.class, args);
	}

}
