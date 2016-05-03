package com.javalec.single;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		
		// 싱글톤 객체 하나로 공유
		
		Student student1 =  ctx.getBean("student", Student.class);
		System.out.println(student1.getName());
		student1.getStatus();
		
		
		Student student2 =  ctx.getBean("student", Student.class);
		student2.setName("송재우");
		student2.setAge(32);
		System.out.println(student2.getName());
		student2.getStatus();
		
		//student1 다시 출력 
		System.out.println(student1.getName());
		student1.getStatus();
		
		
		
	}

}
