package com.gcu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.SpringVersion;

@SpringBootApplication
@ComponentScan({"com.gcu"})
public class Topic43Application {

	public static void main(String[] args) {
		SpringApplication.run(Topic43Application.class, args);
		System.out.println("version: " + SpringVersion.getVersion());
	}

}
