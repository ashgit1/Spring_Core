package com.ashish.javaannotation;

import org.springframework.context.annotation.*;

@Configuration
public class HelloWorldConfig {

	@Bean
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}
}