package com.myCode.controller;

import org.springframework.stereotype.Controller;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	@RequestMapping(value = "/test", method= RequestMethod.GET)
	public ModelAndView showTestPage()
	{
		ModelAndView model = new ModelAndView("TestPage");
		model.getModelMap().addAttribute("msg1", "Hello Test");
		model.addObject("msg2","HelloWorld");
		
		return model;
	}
}
