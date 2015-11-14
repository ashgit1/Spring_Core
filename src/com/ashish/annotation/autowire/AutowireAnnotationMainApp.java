package com.ashish.annotation.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireAnnotationMainApp {
	
   @SuppressWarnings("resource")
public static void main(String[] args) {
	   
      ApplicationContext context = new ClassPathXmlApplicationContext("annotationautowirespring.xml");
      TextEditor te = (TextEditor) context.getBean("textEditor");
      te.spellCheck();
   }
}
/**
 * http://www.tutorialspoint.com/spring/spring_autowired_annotation.htm
 * @Autowire: The @Autowire annotation applies to bean property setter methods, properties and constructors.
 */