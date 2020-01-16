package com.ashok.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ashok.model.User;

@Controller
public class UserController {

	@RequestMapping(value = "/displayForm.htm", method = RequestMethod.GET)
	public String displayForm(Model model) {
		System.out.println("hi");
		int i = 10;
		model.addAttribute("user", new User());
		return "userForm";
	}

	@RequestMapping(value = "/regUser.htm", method = RequestMethod.POST)
	public String regUser(Model model, @ModelAttribute("user") User u) {
		model.addAttribute("user", u);
		return "display";
	}

}
