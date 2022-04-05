package com.finalClickonix.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.finalClickonix.entity.Customer;
import com.finalClickonix.entity.Product;

@Repository
public class CustProdRepo {
	@PersistenceContext
	EntityManager em;
	
	public List<Product> findProdBySid(int id)
	{
		System.out.println("inside custom bid repo"+id);
		return (List<Product>)
				em
				.createQuery("select p from Product p where p.sid = :m")
				.setParameter("m", id)
				.getResultList();
	}
	
	public void updateProd(Product p)
	{
		String c = p.getPcat();
		String d = p.getPdisc();
		String n = p.getPname();
		String pr = p.getPrice();
		String q = p.getPquant();
		int i = p.getPrid();
		System.out.println("inside custom update");
		em
			.createQuery("update product p set p.pcat = :c, p.pdisc = :d, p.pname = :n, p.pprice = :p, p.pquant = :q where p.prid = :i")
			.setParameter("c", c)
			.setParameter("d", d)
			.setParameter("p", pr)
			.setParameter("n", n)
			.setParameter("q", q)
			.setParameter("i", i)
			.getSingleResult();
	}

}
