package com.example.DB_NAVER_PLUSSTORE_CLONECODDING.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @CrossOrigin(origins = "http://localhost:5173")  // ✅ 리액트 포트 허용
    @GetMapping("/api/hello")
    public String hello() {
        return "Hello from Spring Boot!";
    }
}
