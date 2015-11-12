package com.ashish.collectionbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionMainApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		  ApplicationContext context =   new ClassPathXmlApplicationContext("collectionbeanspring.xml");

	      JavaCollection jc=(JavaCollection)context.getBean("javaCollection");

	      jc.getAddressList();
	      jc.getAddressSet();
	      jc.getAddressMap();
	      jc.getAddressProp();

	}

}
