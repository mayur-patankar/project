package com.finalClickonix.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.finalClickonix.dto.LoginDTO;
import com.finalClickonix.entity.Address;
import com.finalClickonix.entity.Customer;
import com.finalClickonix.entity.Payment;
import com.finalClickonix.services.CustomerService;
import com.finalClickonix.services.CustomerServiceImpl;


@CrossOrigin
@RestController
public class CustomerController {

	@Autowired  
	CustomerService customerserv;
	
	@PostMapping("/register")
	public Customer insertCustomer(@RequestBody Customer customer) {
		System.out.println("inside post register");
		System.out.print(customer.getEmail());
		return customerserv.insertCustomer(customer);
	}

	@PostMapping("/login")
	public List<Customer> getUserByEmailAndPassword(@RequestBody LoginDTO l){
		return customerserv.getUserByEmailAndPassword(l.getEmail(), l.getPassword());
	}
	@GetMapping("/allcustomers")
	public List<Customer> getAllUsers(Customer customer){	
		return customerserv.getAllCustomers();	
	}
	@DeleteMapping("deletecust/{id}")
	public String deleteCustomer(@PathVariable int id) {
		customerserv.deleteCustomer(id);
		return "Deleted";
	}
	@GetMapping("/getcust/{id}")
	public List<Customer> getRequestsById(@PathVariable int id) {	
		return customerserv.getRequestById(id);
	}
	
	@PutMapping("/updatecust")
	public Customer updateRequests(@RequestBody Customer customer) {	
		return customerserv.updateCustomer(customer);
	}
	@PostMapping("/registerAddress")
	public Address insertAdress(@RequestBody Address address) {
		return customerserv.insertAddress(address);
	}
	
	@GetMapping("/getAddress/{id}")
	public List<Address> getAddressById(@PathVariable int id) {	
		return customerserv.getAddressById(id);
	}

	@PutMapping("/updatAddress")
	public Address updateAddress(@RequestBody Address address) {	
		return customerserv.updateAddress(address);
	}
	
	
	
	@DeleteMapping("deleteAddress/{id}")
	public String deleteAddress(@PathVariable int id) {
		customerserv.deleteAddress(id);
		return "Deleted";
	}
	
	
	@PostMapping("/payment")
	public Payment insertPayment(@RequestBody Payment payment) {
		return customerserv.insertPayment(payment);
	}
	
	@GetMapping("/payment/{id}")
	public List<Payment> getPaymentById(@PathVariable int id) {	
		return customerserv.getPaymentById(id);
	}
	
}
