package com.malee.ecommerce_pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EcommercePmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommercePmsApplication.class, args);
	}

}
