package com.ashish.javaannotation.others;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CallBacksMainApp{
	
	@SuppressWarnings("resource")
	public static void main(String args[]){
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(CallBackAppConfig.class);
		Foo foo = (Foo) ctx.getBean(Foo.class);
		foo.getFoo();
		
	}
	
}

