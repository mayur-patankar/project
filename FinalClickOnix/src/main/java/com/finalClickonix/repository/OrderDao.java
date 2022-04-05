package com.finalClickonix.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalClickonix.entity.Address;
import com.finalClickonix.entity.Orders;

public interface OrderDao extends JpaRepository<Orders, Integer> {

}
