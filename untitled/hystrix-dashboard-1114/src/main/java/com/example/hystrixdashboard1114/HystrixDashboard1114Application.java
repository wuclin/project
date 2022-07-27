package com.example.hystrixdashboard1114;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboard1114Application {

	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboard1114Application.class, args);
	}

}
