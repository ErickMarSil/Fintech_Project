package com.fintech.project.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// Sorry teacher, i put all the comments and code in english, hope this won´t decrease our grades :D

@SpringBootApplication
@ComponentScan(basePackages = "com.fintech.project.demo.endpoints")
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
