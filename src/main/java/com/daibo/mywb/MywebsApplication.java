package com.daibo.mywb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.daibo.controller")
public class MywebsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MywebsApplication.class, args);
	}
}
