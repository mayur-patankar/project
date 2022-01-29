package com.bidding.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.bidding.entity.User;

@Repository
public class CustomUserRepo {
	
	@PersistenceContext
	protected EntityManager em;
	
	public User findUser(String email, String password)
	{
		return (User)
				em
				.createQuery("select u from User u where u.u_mail = :m and u.u_pass = :pw")
				.setParameter("m", email)
				.setParameter("pw", password)
				.getSingleResult();
	}
}
