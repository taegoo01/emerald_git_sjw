package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class mainClass {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:applicationCTX.xml");
		
		ctx.refresh();
		Student student = ctx.getBean("student", Student.class);
		System.out.println("그녀의 이름은" + student.getName());
		
		ctx.close();
		
	}

}
