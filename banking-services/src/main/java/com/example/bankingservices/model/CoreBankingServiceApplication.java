package com.example.bankingservices.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
@ComponentScan(basePackages = { "io.testapi" })
public class CoreBankingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreBankingServiceApplication.class, args);
	}

}
