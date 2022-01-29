package com.bidding.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bidding.entity.Product;
import com.bidding.repository.ProductRepository;
import com.bidding.repository.ProductRepositoryImple;

@RestController
@CrossOrigin
public class ProductControllers {
	
	@Autowired
	ProductRepository pr;
	
	@GetMapping("/getProduct")
	public List<Product> getProduct()
	{
		System.out.println("getdetails called");
		List<Product> l = pr.findAll();
		return l;
	}
	
	@PutMapping("/putProducts")
	public void putProducts(@RequestBody Product p)
	{
		pr.save(p);
	}
	
}
