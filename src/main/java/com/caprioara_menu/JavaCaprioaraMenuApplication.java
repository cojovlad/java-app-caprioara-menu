package com.caprioara_menu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.caprioara_menu.repository") // Adjust the package accordingly
public class JavaCaprioaraMenuApplication {
	public static void main(String[] args) {
		SpringApplication.run(JavaCaprioaraMenuApplication.class, args);
	}
}
