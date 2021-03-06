package com.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.MainService;

@Controller
public class MainContoller { 
 
	@Resource(name="mainService")
	private MainService mainService;
	
	@RequestMapping(value="/")
	public String test(Model model) throws Exception {
		System.out.println("controller  11"); 
		String test=mainService.selectTest();
		System.out.println(test);    
		model.addAttribute("selectTableList", test);
		return "main/Main";
	}
}
