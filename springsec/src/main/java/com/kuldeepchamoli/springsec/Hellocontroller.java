package com.kuldeepchamoli.springsec;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {
    @GetMapping("/")
    public String hello(HttpServletRequest request) {
        return "welcome to new york"+request.getSession().getId();
    }
}
