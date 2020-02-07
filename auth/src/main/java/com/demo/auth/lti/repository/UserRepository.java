package com.demo.auth.lti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.auth.lti.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
