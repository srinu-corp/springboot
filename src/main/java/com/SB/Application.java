package com.SB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@ComponentScan(basePackages = {"ubi.mycontrollers","com.SB"})
@EnableJpaRepositories("ubi.dbclasses")
@EntityScan("ubi.dbclasses")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public PasswordEncoder pe()
	{
		NoOpPasswordEncoder nop=(NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
		return nop;
	}
	
}
