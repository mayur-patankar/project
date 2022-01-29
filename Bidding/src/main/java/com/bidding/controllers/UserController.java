package com.bidding.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bidding.dto.LoginDetails;
import com.bidding.entity.User;
import com.bidding.repository.CustomUserRepo;
import com.bidding.repository.UserReposImple;
import com.bidding.repository.UserRepository;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {
	
	@Autowired
	UserRepository uri;
	
	@Autowired
	CustomUserRepo cur;
	
	@GetMapping("/getUser")
	public List<User> getUser()
	{
		List<User> l = uri.findAll();
		return l;
	}
	
	@PostMapping("/postUser")
	public void putUser(@RequestBody User u)
	{
		uri.save(u);
	}
	
	@PostMapping("/getLoginDetails")
	public User getLoginDetails(@RequestBody LoginDetails ld)
	{
		System.out.println(ld);
		String email = (String) ld.getEmail();
		String password = (String) ld.getPassword();
		System.out.println(email);
		System.out.println(password);
		User u;
		try {
		u =(User) cur.findUser(email, password);
		System.out.println(u.getU_name());
		return u;
		}
		catch(Exception e) {
			return null;
		}
		
	}
	
}
