package com.example.Sunbase.Customer.Portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.Sunbase.Customer.Portal.service.CustomerService;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SunbaseCustomerPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(SunbaseCustomerPortalApplication.class, args);
	}

}
