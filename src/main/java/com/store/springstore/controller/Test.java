package com.store.springstore.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")
public class Test {

    @GetMapping("/")
    public String Hello(){
        return "Hello! Instant: "+ new Date();
    }
}
