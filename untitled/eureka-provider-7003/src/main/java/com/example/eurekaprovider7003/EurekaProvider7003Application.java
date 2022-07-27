package com.example.eurekaprovider7003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaProvider7003Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaProvider7003Application.class, args);
	}

}
