package org.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class MainController {
	@RequestMapping("/home")
	public String sayHello() {
		System.out.println("This is home page!");
		return "home";
	}
}
