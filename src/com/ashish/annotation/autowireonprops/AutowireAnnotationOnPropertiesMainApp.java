package com.ashish.annotation.autowireonprops;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireAnnotationOnPropertiesMainApp {
	
   @SuppressWarnings("resource")
public static void main(String[] args) {
	   
      ApplicationContext context = new ClassPathXmlApplicationContext("annotationautowireonpropertiesspring.xml");
      TextEditor te = (TextEditor) context.getBean("textEditor");
      te.spellCheck();
   }
}
/**
 * http://www.tutorialspoint.com/spring/spring_autowired_annotation.htm
 */