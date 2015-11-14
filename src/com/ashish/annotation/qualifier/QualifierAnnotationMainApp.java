package com.ashish.annotation.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QualifierAnnotationMainApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("annotationqualifierspring.xml");
		Profile profile = (Profile) context.getBean("profile");
		
		profile.printName();
		profile.printAge();
	}

}
