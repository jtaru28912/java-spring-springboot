package springmvcserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home() {
		System.out.println("This is home ");
		return "index";
	}
	@RequestMapping("/about")
	public String abput() {
		System.out.println("This is about");
		return "about";
		}

}
