package com.simplilearn.bean;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class CustomEventListener implements ApplicationListener{

	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("Event was handled !");
		System.out.println("Event "+ event.toString());
	}

}
