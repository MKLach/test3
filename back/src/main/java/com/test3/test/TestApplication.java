package com.test3.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		System.out.println("starting!!!");
		System.out.println("starting2!!!");
		System.out.println("starting3!!!");
		SpringApplication.run(TestApplication.class, args);
	}

}
