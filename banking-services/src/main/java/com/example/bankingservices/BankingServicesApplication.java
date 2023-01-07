package com.example.bankingservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "io.testapi" })
public class BankingServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingServicesApplication.class, args);
	}

}
