package com.example.UberBookingService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableDiscoveryClient
@EnableJpaAuditing
@EntityScan("com.example.UberProject_EntityService.models")
public class UberBookingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UberBookingServiceApplication.class, args);
	}

}
