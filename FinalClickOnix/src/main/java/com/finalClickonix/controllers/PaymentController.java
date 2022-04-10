package com.finalClickonix.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.finalClickonix.dto.IdDTO;
import com.finalClickonix.entity.Payment;
import com.finalClickonix.repository.PaymentDao;

@RestController
@CrossOrigin
public class PaymentController {

	@Autowired
	PaymentDao pd;
	
	@PostMapping("/getPaymentByUser")
	public Optional<Payment> getPaymentByUser(@RequestBody IdDTO i)
	{
		return pd.findById(i.getId());
	}
}
