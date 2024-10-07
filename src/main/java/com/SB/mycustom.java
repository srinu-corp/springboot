package com.SB;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class mycustom implements UserDetailsService {

	
	public UserDetails loadUserByUsername(String username)
	{
		User u=(User) User.withUsername("srinu").password("vasu").authorities("admin").build();
		return u;
	}

}
