package com.javalec.mvc_pj;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MyController {

	@RequestMapping("/view")
	public String view(){
		
		return"view";
	}
	
	@RequestMapping("/content/contentView")
	public String contentView(Model model){
		model.addAttribute("id", "abcde");
		return "content/contentView";
	}
	
	@RequestMapping("/member/modelJoin")
	public String modelJoin(Member member){
		
		return "/member/modelJoin";
	}
	
	@RequestMapping("/form/index")
	public String index() {
		
		return"form/index";
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/form/student")
	public String goStudent(Member member) {
		
		
		return "form/student";
	}
}
