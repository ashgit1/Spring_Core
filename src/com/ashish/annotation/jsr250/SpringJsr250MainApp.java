package com.ashish.annotation.jsr250;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringJsr250MainApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("annotationjsr250spring.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
		context.registerShutdownHook();
	}
}
/**
 * http://www.tutorialspoint.com/spring/spring_jsr250_annotations.htm
 * Also Read about @Resource annotation.
 * @Resource Annotation: You can use @Resource annotation on fields or setter methods 
 * and it works the same as in Java EE 5. The @Resource annotation takes a 'name' attribute 
 * which will be interpreted as the bean name to be injected. You can say, it follows by-name autowiring semantics.
 */
