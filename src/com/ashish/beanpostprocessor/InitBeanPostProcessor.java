package com.ashish.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object beanName, String arg1)
			throws BeansException {
		System.out.println("AfterInitialization : " + beanName);
		return beanName; // you can return any other object as well
	}

	@Override
	public Object postProcessBeforeInitialization(Object beanName, String arg1)
			throws BeansException {
		System.out.println("BeforeInitialization : " + beanName);
		return beanName; // you can return any other object as well
	}

}
