package com.gcu.business;

import org.springframework.stereotype.Service;

@Service 
public class SecurityBusinessService {
	public boolean authenticate(String username, String password) {
		System.out.println("Soran, hello from the SecurityBusinessService");
		return true;
	}
}
