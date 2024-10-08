package com.example.Spring.Boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Stack;

@RestController public class Health_check {

    @GetMapping ("/Health-check")
    public String HealthCheck(){
        return "OK";
    }
}
