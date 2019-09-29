package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.UserVo;
@Service
public class LoginAuthenticationService {
	
	public boolean isValidAuthentication(UserVo user) {
		boolean flag=false;
		if(user.getUserName().equals("partha") && user.getPassword().equals("partha9153@"))
			flag=true;
		return flag;
		
	}

}
