package com.wipro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wipro.model.User;


@Controller
@RequestMapping("/lc")
public class LoginController {


	@GetMapping("/login")
	public String preLogin(Model model) {
		model.addAttribute("user", new User());
		return "login";
	}
	
	@PostMapping("/postlogin")
	public String postLogin(@ModelAttribute User user, Model model) {
		model.addAttribute("user", user);
		if(user.getUserName().equalsIgnoreCase(user.getPassword())) {
			return "invalid";
		}else {
			return "valid";
			}
	}
}
