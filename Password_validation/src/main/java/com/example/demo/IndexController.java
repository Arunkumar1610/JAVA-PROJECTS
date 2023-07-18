package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@RequestMapping("pwd")
	public ModelAndView index()
	{
		ModelAndView mv= new ModelAndView();

		mv.setViewName("arun.jsp");
		return mv;

	}
	
	
	@RequestMapping("check")
	public ModelAndView add(password pw)
	{
	
		Boolean isValid1=pw.isValidPassword(pw.getPassword());
		
		if(isValid1==true)
		{
			ModelAndView mv=new ModelAndView();
			mv.setViewName("isValid.jsp");
			return mv;
			
		}
		else
		{
			ModelAndView mv=new ModelAndView();
			mv.setViewName("isNotValid.jsp");
			return mv;
		}
		
	}
	
}
