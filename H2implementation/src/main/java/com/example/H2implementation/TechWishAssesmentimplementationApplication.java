package com.example.H2implementation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableWebMvc
@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = {"com.example.H2implementation"})
public class TechWishAssesmentimplementationApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechWishAssesmentimplementationApplication.class, args);
	}

}
