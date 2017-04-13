package com.luv2code.springdemo.mvc;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	@RequestMapping("/showForm")
	public String showForm(){
		System.out.println("this one");
		return "helloworld-form";
	}
	@RequestMapping("/processForm")
	public String processForm(){
		System.out.println("procesforom");
		return "helloworld";
	}
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model){
		String name = request.getParameter("studentName");
		model.addAttribute("message", "yo!" + name.toUpperCase());
		return "helloworld";
	}
	//binding request params 114
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String name, 
			Model model){
		model.addAttribute("message", "Ahy my friend from v3!" + name.toUpperCase());
		return "helloworld";
	}
}
