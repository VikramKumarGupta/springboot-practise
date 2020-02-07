package com.demo.auth.lti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.auth.lti.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
