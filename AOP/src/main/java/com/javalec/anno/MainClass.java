package com.javalec.anno;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTXanno.xml");
		Student student = ctx.getBean("student", Student.class);
		student.getInfo();
		
		ctx.close();
		
		
		
		
	}

}
