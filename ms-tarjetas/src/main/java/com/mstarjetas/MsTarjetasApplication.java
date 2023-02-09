package com.mstarjetas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories("com.persistence.repository")
@EntityScan("com.persistence.entity")
public class MsTarjetasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsTarjetasApplication.class, args);
	}

}
