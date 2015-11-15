package com.ashish.javaannotation.injectingbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class InjectingBeansMainApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(TextEditorConfig.class);
		TextEditor te = ctx.getBean(TextEditor.class);
        te.spellCheck();		
	}
}
