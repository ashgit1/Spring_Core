package com.ashish.eventhandling;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class CCloseEventHandler implements ApplicationListener<ContextClosedEvent>{

	@Override
	public void onApplicationEvent(ContextClosedEvent event) {
		System.out.println("Contect ClosedEvent Received :" + event.toString());
	}

}
