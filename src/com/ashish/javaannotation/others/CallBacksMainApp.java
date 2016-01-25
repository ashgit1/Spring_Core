package com.ashish.javaannotation.others;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class CallBacksMainApp{
	
	@SuppressWarnings("resource")
	public static void main(String args[]){
		
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(CallBackAppConfig.class);
		Foo foo = (Foo) ctx.getBean(Foo.class);
		foo.getFoo();
		ctx.registerShutdownHook();
		
	}
	
}

