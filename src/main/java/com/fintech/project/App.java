package com.fintech.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// Sorry teacher, i put all the comments and code in english, hope th1is won´t decrease our grades :D

@SpringBootApplication
@ComponentScan(basePackages = "com.fintech.project.endpoints")
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
