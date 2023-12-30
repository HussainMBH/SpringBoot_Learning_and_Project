package com.example.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringlearningApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringlearningApplication.class, args);
			Home h = context.getBean(Home.class);
			//Spring of bean 
			h.connect();
			
			Home h2 = context.getBean(Home.class);
			h2.connect();
	}

}
