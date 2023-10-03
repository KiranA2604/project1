package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController
{
	  @RequestMapping("/")
	 public String viewhome() 
	 {
		 return "home";
	 }

}
