package com.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	
	@RequestMapping("/")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/login-panel")
	public String homePage(UserLgin user, Model model) {
		
		
		//model.addAttribute("upass", user.getUserPasswd());
		if(user.getUserName().equals("chinmay") && user.getUserPasswd().equals("123"))
		{
			model.addAttribute("loguser", user);
			return "home";
		}
		else {
			model.addAttribute("msg","Login Failed...");
			return "login";
		}
		
	}
}
