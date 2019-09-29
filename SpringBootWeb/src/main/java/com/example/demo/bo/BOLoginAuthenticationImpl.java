package com.example.demo.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.UserVo;
import com.example.demo.service.LoginAuthenticationService;
@Component
public class BOLoginAuthenticationImpl implements BOLoginAuthentication{
	@Autowired
	LoginAuthenticationService loginAuthenticationService;
	@Override
	public String boValidAuthentication(UserVo user) {
		// TODO Auto-generated method stub
		boolean flag=false;
		flag=loginAuthenticationService.isValidAuthentication(user);
		if(flag==true)
			return "Authentication Sucessful!!";
		else
		return "Authentication Fail";
	}
	 

}
