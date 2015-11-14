package com.ashish.annotation.autowithfalse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireFalseAnnotationMainApp {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("annotationautowirefalsespring.xml");

		Student student = (Student) context.getBean("student");

		System.out.println("Name : " + student.getName());
		System.out.println("Age : " + student.getAge());
	}
}

/*
 * @Required: The @Required annotation applies to bean property setter methods.
 */