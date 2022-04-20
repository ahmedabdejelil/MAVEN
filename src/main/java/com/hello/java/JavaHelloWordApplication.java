package com.hello.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaHelloWordApplication {

	public static void main(String[] args) {
		hello();
		SpringApplication.run(JavaHelloWordApplication.class, args);
		  
	}
	
	public  static  void  hello() {
		System.out.println("Hello Word");
	}

}
