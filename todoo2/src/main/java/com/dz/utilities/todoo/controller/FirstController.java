package com.dz.utilities.todoo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dz.utilities.todoo.services.UserManager;
import com.dz.utilities.todoo.utils.ToDooUtil;

@Controller
public class FirstController {
	@Autowired
	private UserManager userMan;
	
	@RequestMapping("/index")
	public ModelAndView frontPage(String name, Model model){
		userMan.createUser("Dawei", "Zhuang", "DZ", ToDooUtil.calcMD5("1234"));
		return new ModelAndView("index","name","Dawei Zhuang");
	}

	@RequestMapping("/")
	public ModelAndView welcomePage(String name, Model model){
		return frontPage(name, model);
	}
}
