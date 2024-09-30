package com.dtbx.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Victor Mithamo
 * Created At: 28 Sep, 2024 11:26
 * Project: spring-security
 * Package: com.dtbx.springsecurity.controller
 */
@RestController
public class WecomeController {

    /**
     * Endpoint to say welcome to the user
     * @return a simple welcome message
     */
    @GetMapping("/welcome")
    public String sayWelcome() {
        return "Welcome to Spring Application with security";
    }
}
