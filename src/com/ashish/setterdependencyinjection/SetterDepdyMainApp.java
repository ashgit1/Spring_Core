package com.ashish.setterdependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDepdyMainApp {
   @SuppressWarnings("resource")
public static void main(String[] args) {
	   
      ApplicationContext context = new ClassPathXmlApplicationContext("setterdependencyspring.xml");

      TextEditor te = (TextEditor) context.getBean("textEditor");

      te.spellCheck();
   }
}

/*
 * http://www.tutorialspoint.com/spring/spring_dependency_injection.htm
 * http://www.tutorialspoint.com/spring/setter_based_dependency_injection.htm
 */