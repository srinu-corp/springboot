package com.SB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"ubi.mycontrollers"})
@EnableJpaRepositories("ubi.dbclasses")
@EntityScan("ubi.dbclasses")
public class Application {

	public static void main(String[] args) {
		System.out.println("srinu");
		SpringApplication.run(Application.class, args);
		System.out.println("hai vasu");
	}

}
