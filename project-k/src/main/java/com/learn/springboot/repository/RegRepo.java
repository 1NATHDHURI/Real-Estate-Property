package com.learn.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.springboot.entity.Register;

public interface RegRepo extends JpaRepository<Register, Integer> {



	Register findByEmail(String email);

}
