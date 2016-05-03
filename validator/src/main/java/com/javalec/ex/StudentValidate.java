package com.javalec.ex;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class StudentValidate implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		return Student.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object obj, Errors err) {
		
		Student student = (Student)obj;
		
		String studentName = student.getName();
		if(studentName == null || studentName.trim().isEmpty()){
			
			err.reject("name", "trouble");
		}
		
		int studentId = student.getId();
		if(studentId == 0){
			err.reject("id", "trouble");
		}
		
	}

}
