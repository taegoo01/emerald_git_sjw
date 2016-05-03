package com.javalec.mvc_pj;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {

	@RequestMapping("/studentConfirm")
	public String studentRedirect(HttpServletRequest httpServletRequest,
			Model model){
		
		String id = httpServletRequest.getParameter("id");
		model.addAttribute("id", id);
		
		System.out.println(id);
		if(id.equals("abc")){
			return "redirect:studentOk";
		}
		
		return "redirect:studentNg";
	}
	
	@RequestMapping("/studentOk")
	public String studentOk(Model model){
		
		return "student/studentOk";
	}
	
	@RequestMapping("/studentNg")
	public String studentNg(Model model){
		
		return "student/studentNg";
	}
	
}
