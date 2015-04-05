package com.wallet.accounting.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wallet.accounting.entity.User;
import com.wallet.accounting.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/login")
	public ModelAndView login(String loginName, String pwd) {
		return new ModelAndView();
	}

	@RequestMapping("/list")
	public ModelAndView getAllUsers() {
		List<User> users = userService.findAllUser();
		Map<String, List<User>> retVal = new HashMap<String, List<User>>();
		retVal.put("user", users);
		return new ModelAndView("/user/list", retVal);
	}
}
