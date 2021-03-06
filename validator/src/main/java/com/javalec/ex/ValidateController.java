package com.javalec.ex;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ValidateController {

	@RequestMapping("/studentForm")
	public String studentForm(){
		return "createPage";
	}
	
	@RequestMapping("/student/create")
	public String studentCreate(Student student, BindingResult result) {
		
		String page = "createDonePage";
		
		StudentValidate validate = new StudentValidate();
		validate.validate(student, result);
		if(result.hasErrors()){
			page = "createPage";
		}
		
		return page;
	}
}
