package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bo.BOLoginAuthentication;
import com.example.demo.model.UserVo;

@RestController
@ComponentScan("com.example.demo")
public class LoginAuthentication {
	@Autowired
	BOLoginAuthentication bologinAuthentication;
	
	 @RequestMapping(value = "/hello", method = RequestMethod.POST,  produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, consumes = MediaType.ALL_VALUE)
	public String validAuthentication( UserVo user) {
		
		return bologinAuthentication.boValidAuthentication(user);
		
		 
	}

}
