package com.ashish.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstDepdyMainApp {
   @SuppressWarnings("resource")
public static void main(String[] args) {
	   
      ApplicationContext context = new ClassPathXmlApplicationContext("constdependencyspring.xml");

      TextEditor te = (TextEditor) context.getBean("textEditor");

      te.spellCheck();
   }
}

/*
 * http://www.tutorialspoint.com/spring/spring_dependency_injection.htm
 * http://www.tutorialspoint.com/spring/constructor_based_dependency_injection.htm
 */