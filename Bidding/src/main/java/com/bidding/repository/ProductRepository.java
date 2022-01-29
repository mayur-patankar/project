package com.bidding.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bidding.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Integer>{

}
