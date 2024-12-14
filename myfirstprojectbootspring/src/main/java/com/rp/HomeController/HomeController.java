package com.rp.HomeController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.rp.CustData.CustData;
import com.rp.UserService.UserService;



@RestController
public class HomeController {
     @Autowired
	UserService regService;
	@RequestMapping("/")
	public ModelAndView home()
	{
		ModelAndView mv1=new ModelAndView();
		mv1.setViewName("index");
		return mv1;
	}
	@RequestMapping("/about")
	public ModelAndView about()
	{
		ModelAndView mv1=new ModelAndView();
		mv1.setViewName("about");
		return mv1;
	}
	@RequestMapping("/login")
	public ModelAndView login()
	{
		ModelAndView mv1=new ModelAndView();
		mv1.setViewName("login");
		return mv1;
	}
	@RequestMapping(path="/login", method = RequestMethod.POST)
	public ModelAndView loginCheck(@ModelAttribute("log") CustData log,
		       Model model)
	{
		ModelAndView mv1=new ModelAndView();
		if(log.getUnm().isBlank())
		{	mv1.setViewName("login");
		
		}else
		{	
			boolean x=this.regService.search(log.getUnm(),log.getPw());
			if(x)
			{
				mv1.setViewName("registration");	
			}else
			{
				mv1.setViewName("login");
			}
		}	
		
		return mv1;
	}
	@RequestMapping("/registration")
	public ModelAndView registration()
	{
		ModelAndView mv1=new ModelAndView();
		mv1.setViewName("registration");
		return mv1;
	}
	@RequestMapping(path="/registration", method = RequestMethod.POST)
	public ModelAndView reg(@ModelAttribute("reg") CustData reg,
			       Model model)
	{
	ModelAndView mv=new ModelAndView();

		if (reg.getName().isBlank()) {
			mv.setViewName("redirect:/registration");
		}
		this.regService.addSubject(reg);
		mv.setViewName("registration");

		return mv;
	}

}
