package io.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		/*
		 * Create Servlet Container & Host this Application
		 * 
		 * */
		SpringApplication.run(CourseApiApp.class, args);
		
		/**
		 * SpringApplication is Static Method
		 * 	The Class Name must be annotated with @SpringBootApplication
		 * 	args are passed to main method the @SpringBootApplication Class
		 * 
		 */
	}

}
