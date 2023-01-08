package com.example.bankingservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.example.bankingservices" })
public class BankingServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingServicesApplication.class, args);
	}

}
