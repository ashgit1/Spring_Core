package com.ashish.beaninheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BeanInheritanceMainApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beaninheritancespring.xml");

		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

		objA.getMessage1();
		objA.getMessage2();

		HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
		objB.getMessage1();
		objB.getMessage2();
		objB.getMessage3();

	}

}
/*
 * http://www.tutorialspoint.com/spring/spring_bean_definition_inheritance.htm
 */
