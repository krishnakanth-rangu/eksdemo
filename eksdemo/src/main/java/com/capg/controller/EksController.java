package com.capg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EksController {

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello from Spring Boot EKS Demo";
    }
}