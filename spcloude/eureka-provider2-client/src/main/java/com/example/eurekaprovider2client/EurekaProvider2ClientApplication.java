package com.example.eurekaprovider2client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaProvider2ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaProvider2ClientApplication.class, args);
	}

}
