package com.ejemplo.miapi.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @CrossOrigin(origins = "https://ciendias-web.onrender.com")
    @GetMapping("/hello")
    public String sayHello() {
        return "¡Hola, Mundo!";
    }
}
