package com.finalClickonix.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalClickonix.entity.Address;



public interface AddressDao extends JpaRepository<Address, Integer> { 
	public List<Address> findByaddressId(int id);
}
