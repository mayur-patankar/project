package com.finalClickonix.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.finalClickonix.entity.Customer;

@Repository
public class FindQuerry {
	@PersistenceContext
	EntityManager em;
	
	public List<Customer> findcustById(int id)
	{
		System.out.println("inside custom bid repo"+id);
		return (List<Customer>)
				em
				.createQuery("select c from Customer c where c.custid = :m")
				.setParameter("m", id)
				.getResultList();
	}

}
