package com.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MyProjectApplication.class, args);
		
		Home h = context.getBean(Home.class);
		h.connect();
		
		Home h2 = context.getBean(Home.class);
		h2.connect();
	}

}
