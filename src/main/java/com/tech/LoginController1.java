package com.tech;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController1 {
	
	public LoginController1() {
		System.out.println("inside LoginController1");
	}
     
	@RequestMapping("/login")
	public ModelAndView validation() {
		
		System.out.println("validation method");
		
		
		ModelAndView mav =new ModelAndView("suc");
		return mav;
	}
}
