package com.springbootfirst.app;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//crud operation can be performed over controller class
//Controller+Response = RestController
@RestController
public class Homecontroller {
	//http methods
	//get method-get
	//post-create
	//put-update
	//delete-delete
	//@ResponseBody = annotation uses http message 
	//to return value to http response only
	
	//method
	@GetMapping("/home")
	public String helloWorld() {
		return "Hello ";
	}

}
