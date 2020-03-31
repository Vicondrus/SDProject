package com.project.SDProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories("com.project.repository")
@EntityScan( basePackages = {"com.project.entities"} )
@ComponentScan( basePackages = {"com.project"} )
public class SdProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SdProjectApplication.class, args);
	}

}
