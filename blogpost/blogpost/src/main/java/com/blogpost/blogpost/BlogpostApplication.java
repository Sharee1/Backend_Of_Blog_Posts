package com.blogpost.blogpost;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.blogpost.blogpost.services")
@SpringBootApplication
public class BlogpostApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogpostApplication.class, args);
	}

}
