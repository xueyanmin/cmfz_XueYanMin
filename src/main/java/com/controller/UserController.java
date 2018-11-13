package com.controller;

import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/save")
	public String save(User user){
		System.out.println(user);
		userService.save(user);
		
		return "back/user/login";
	}
	
	@RequestMapping("/queryone")
	public String queryone(String username,String password){
		User us = userService.queryOne(username,password);
		//System.out.println(username);
		if(us!=null){
			return "redirect:/emp/queryAll";
		}else
			return "redirect:/regist.jsp";
	}
}
