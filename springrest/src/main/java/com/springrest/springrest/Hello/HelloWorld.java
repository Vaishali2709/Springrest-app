package com.springrest.springrest.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//controller
@RestController
public class HelloWorld {
	
	//URI
    @RequestMapping(method = RequestMethod.GET,path = "/helloworld")
//	@GetMapping("/hellotest")
	public String helloWorld()
	{
		return "Hello World from Ranchi";
	}

}
