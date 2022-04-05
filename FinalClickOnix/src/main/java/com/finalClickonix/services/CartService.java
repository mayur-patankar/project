package com.finalClickonix.services;

import java.util.List;

import com.finalClickonix.entity.Cart;
import com.finalClickonix.entity.Product;

public interface CartService {

	//add to cart
	public Cart AddItem(Cart cart);
	
	//remove from cart
	public void deleteItemFromCart(int id);
	
	//product in cart
	public List<Cart> getAllItem();
}
