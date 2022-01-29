package com.bidding.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bidding.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
