package com.everis.marcelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.marcelo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {}
