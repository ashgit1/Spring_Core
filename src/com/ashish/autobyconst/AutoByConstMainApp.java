package com.ashish.autobyconst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoByConstMainApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		      ApplicationContext context = new ClassPathXmlApplicationContext("autobyconstspring.xml");
		      TextEditor te = (TextEditor) context.getBean("textEditor");
		      te.spellCheck();
		      te.getName();
	}

}
/*
 * http://www.tutorialspoint.com/spring/spring_beans_autowiring.htm
 * http://www.tutorialspoint.com/spring/spring_autowiring_byname.htm
 */
