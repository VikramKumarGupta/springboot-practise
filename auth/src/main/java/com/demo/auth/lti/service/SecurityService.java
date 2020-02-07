package com.demo.auth.lti.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
