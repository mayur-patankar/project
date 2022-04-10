package com.finalClickonix.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalClickonix.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
