package com.meta.p3ts.services;

import org.springframework.security.core.context.SecurityContextHolder;

import com.meta.p3ts.security.UserSS;

public class UserService {

	public static UserSS authenticated() {
		try {
			return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		}
		catch(Exception e) {
			return null;
		}
	}	
}