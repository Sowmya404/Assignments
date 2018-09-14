package com.applications.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.applications.model.LoginDetails;
import com.applications.service.LoginValidationService;

@Controller
public class LoginController {

	@Autowired
	private LoginValidationService validationService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView createLoginForm(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView model = new ModelAndView("login");
		LoginDetails details = new LoginDetails();
		model.addObject("login", details);
		return model;
	}

	@RequestMapping(value = "/submitForm", method = RequestMethod.POST)
	public ModelAndView submitLoginForm(HttpRequest request,
			HttpServletResponse response,
			@ModelAttribute("login") LoginDetails details) {
		ModelAndView model = null;
		boolean result = validationService.userValidation(details);
		if (result) {
			model = new ModelAndView("welcome");
			model.addObject("username", details.getUserName());
		} else {
			model = new ModelAndView("login");
			model.addObject("message", "Please provide valid credentials");
		}
		return model;
	}

}
