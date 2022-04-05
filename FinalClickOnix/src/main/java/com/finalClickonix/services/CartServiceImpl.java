package com.finalClickonix.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.finalClickonix.repository.CartDao;
import com.finalClickonix.entity.Cart;

public class CartServiceImpl implements CartService {
	
	@Autowired
	private CartDao cartdao;

	@Override
	public Cart AddItem(Cart cart) {
		
		return cartdao.save(cart);
	}

	@Override
	public void deleteItemFromCart(int id) {
		Cart cart = cartdao.getById(id);
		cartdao.delete(cart);
		
	}

	@Override
	public List<Cart> getAllItem() {
		
		 return this.cartdao.findAll();
	}

}
