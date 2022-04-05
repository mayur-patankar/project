package com.finalClickonix.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalClickonix.entity.Cart;

public interface CartDao extends JpaRepository<Cart,Integer > {

}
