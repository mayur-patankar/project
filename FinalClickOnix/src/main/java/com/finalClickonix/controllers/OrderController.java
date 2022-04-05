package com.finalClickonix.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.finalClickonix.entity.Orders;
import com.finalClickonix.repository.OrderDao;

@CrossOrigin
@RestController
public class OrderController {
	
	@Autowired
	OrderDao od;
	
	@PostMapping("/putOrder")
	public void putOrder(@RequestBody Orders o)
	{
		od.save(o);
	}
	
	@GetMapping("/getOrder")
	public List<Orders> getOrder()
	{
		return od.findAll();
	}
}
