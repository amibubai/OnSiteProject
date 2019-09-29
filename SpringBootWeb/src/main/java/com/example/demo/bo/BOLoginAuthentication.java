package com.example.demo.bo;

import org.springframework.stereotype.Component;

import com.example.demo.model.UserVo;
@Component
public interface BOLoginAuthentication {
	public String boValidAuthentication(UserVo user);
}
