package com.ashish.annotation.autowireonconst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireAnnotationOnConstructorMainApp {
	
   @SuppressWarnings("resource")
public static void main(String[] args) {
	   
      ApplicationContext context = new ClassPathXmlApplicationContext("annotationautowireonconstructorspring.xml");
      TextEditor te = (TextEditor) context.getBean("textEditor");
      te.spellCheck();
   }
}
/**
 * http://www.tutorialspoint.com/spring/spring_autowired_annotation.htm
 */