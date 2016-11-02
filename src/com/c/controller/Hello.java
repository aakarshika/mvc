package com.c.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
/*
 * author: Aakarshika
 * 
 */
 
@Controller
public class Hello {
 
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>Hello World!<br><br>";
		return new ModelAndView("welcome", "message", message);
	}
}
