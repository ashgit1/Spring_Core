package com.ashish.javaannotation.others;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CallBackAppConfig {
	
	@Bean(initMethod = "init", destroyMethod = "cleanup" )
	   public Foo foo() {
	      return new Foo();
	   }
}
