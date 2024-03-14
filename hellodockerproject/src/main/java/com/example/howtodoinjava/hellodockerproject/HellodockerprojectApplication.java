package com.example.howtodoinjava.hellodockerproject;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
public class HellodockerprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellodockerprojectApplication.class, args);
	}
	
	class hellodockerprojectRestController {
		  @RequestMapping("/hello/{name}")
		  public String helloDockerProject(@PathVariable(value = "name") String name) {
		    String response = "Hello " + name + " Response received on : " + new Date();
		    System.out.println(response);
		    return response;
		 
		  }

}
}