package com.javalec.mvc_pj;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HttpRquest {

	@RequestMapping("board/confirmId")
	public String confirmId(HttpServletRequest httpServletRequest, Model model){
		String id= httpServletRequest.getParameter("id");
		String pw= httpServletRequest.getParameter("pw");
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		
		return "board/confirmId";
	}
}
