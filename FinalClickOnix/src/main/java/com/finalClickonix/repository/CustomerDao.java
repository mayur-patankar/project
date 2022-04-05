package com.finalClickonix.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finalClickonix.entity.Customer;


public interface CustomerDao extends JpaRepository<Customer, Integer> {
	public List<Customer> findByEmailAndPassword(String email,String password);

	public List<Customer> findByEmail(String email);
	
	
	

}