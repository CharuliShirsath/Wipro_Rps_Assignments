package com.wipro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wipro.model.Person;

@Controller
@RequestMapping("/pc")
public class PersonController {
	
//	@RequestMapping( value = "/register" , method = RequestMethod.POST)
	@PostMapping("/register")
	public String registerPerson(@ModelAttribute Person person, Model model) {
		model.addAttribute("person", person);
		System.out.println(person);
		return "status";
	}
	
	//http://localhost:8081/spring-mvc-app/pc/registration
	@GetMapping("/registration")
	public String getRegistration(Model model) {
		model.addAttribute("person", new Person());
		return "register";
	}

}
