package com.simplilearn.bean;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventPublisher implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher publisher;
	
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;		
	}
	
	// publish event 
	public void publish() {
		CustomEvent ce = new CustomEvent(this);
		publisher.publishEvent(ce);
	}

}
