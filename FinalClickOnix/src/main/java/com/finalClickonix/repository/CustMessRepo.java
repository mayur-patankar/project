package com.finalClickonix.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.finalClickonix.entity.Message;
import com.finalClickonix.entity.Product;

@Repository
public class CustMessRepo {

	@PersistenceContext
	EntityManager em;
	
	public List<Message> findMessages(List<String> ll)
	{
		return (List<Message>)
				em
				//.createQuery("select p from Message p where p.t = :t1 or :t2 and p.f = :f1 or :f2")
				.createQuery("select p from Message p where p.t in :t1 and p.f in :f1")
				.setParameter("t1", ll)
				.setParameter("f1", ll)
				.getResultList();
	}
}
//SELECT p FROM Product p WHERE p.id IN (:ids)