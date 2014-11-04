package com.myCode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.myCode.entity.Users;
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
		ModelAndView model = new ModelAndView("TestPage");
		
		//userservice.newUser();
		//model.getModelMap().addAttribute("userList", users);
		model.getModelMap().addAttribute("msg1", "Hello Test");
		model.addObject("msg2","HelloWorld");
		
		return model;
	}
	
	@RequestMapping(value = "/login", method= RequestMethod.GET)
	public ModelAndView showLoginPage()
	{
		ModelAndView model = new ModelAndView("loginPage");
		model.getModelMap().addAttribute("user" ,new Users());
		//model.addObject("user" ,new Users());
		//userservice.newUser();
		//model.getModelMap().addAttribute("userList", users);
		//model.getModelMap().addAttribute("msg1", "Hello Test");
		//model.addObject("msg2","HelloWorld");
		
		return model;
	}
	
	@RequestMapping(value = "/login.do", method= {RequestMethod.POST,RequestMethod.GET})
	public ModelAndView doLogin(@ModelAttribute("user") Users user)
	{
		ModelAndView model = new ModelAndView("TestPage");
		
		//userservice.newUser(user);
		//model.getModelMap().addAttribute("userList", users);
		model.getModelMap().addAttribute("msg1", "User created with first name :"+user.getFirstName()+"and last name:"+user.getLastName());
		model.addObject("msg2","Login successful");
		
		return model;
	}
}
