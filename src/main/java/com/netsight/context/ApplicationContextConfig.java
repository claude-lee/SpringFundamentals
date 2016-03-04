package com.netsight.context;

import org.springframework.context.ApplicationContext;

public class ApplicationContextConfig {
	
	private ApplicationContext context;
	private String name;
	private String beanName;
	
	
	public String getBeanName() {
		return beanName;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public ApplicationContext getContext() {
		return context;
	}

	public void setContext(ApplicationContext context) {
		this.context = context;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
