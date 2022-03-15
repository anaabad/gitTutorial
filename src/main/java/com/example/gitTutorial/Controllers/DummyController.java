package com.example.gitTutorial.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class DummyController {
    @ResponseStatus(HttpStatus.OK)
    @GetMapping()
    public String show() {
        return "Hello there! :)";
    }
}
