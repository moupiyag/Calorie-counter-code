package com.myCode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.myCode.service.UserService;

//import com.myCode.repository.UserRepository;

@Controller
public class TestController {
	
	//private UserRepository repo;
	@Autowired
	UserService userservice;
	
	@RequestMapping(value = "/test", method= RequestMethod.GET)
	public ModelAndView showTestPage()
	{
		//List users = repo.findAll();
		
		
		
		ModelAndView model = new ModelAndView("TestPage");
		
		userservice.newUser();
		//model.getModelMap().addAttribute("userList", users);
		model.getModelMap().addAttribute("msg1", "Hello Test");
		model.addObject("msg2","HelloWorld");
		
		return model;
	}
}
