package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTXex.xml");
		
		AdminConnection adminConnection = ctx.getBean("adminConnection", AdminConnection.class);
		
		System.out.println(adminConnection.getAdminId());
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}

}
