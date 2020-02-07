package com.demo.auth.lti.service;

import com.demo.auth.lti.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
