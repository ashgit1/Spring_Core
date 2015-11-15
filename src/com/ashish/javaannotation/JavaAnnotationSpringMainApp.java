package com.ashish.javaannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class JavaAnnotationSpringMainApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		
		helloWorld.setMessage("This is Java based annotation on Spring...");
		helloWorld.getMessage();
	}

}

/*
 * http://www.tutorialspoint.com/spring/spring_java_based_configuration.htm
 */