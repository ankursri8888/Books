package com.library.Books.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class healthCheck {
    @GetMapping("/healthcheck")
    public String healthcheck(){
        return "health is okay";
    }
}
