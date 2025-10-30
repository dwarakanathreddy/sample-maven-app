package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GithubController {

    @GetMapping("/version")
    public String getVersion() {
        return "version v1";
    }
}