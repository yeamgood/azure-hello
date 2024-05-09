package com.yeamgood.azurehelloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping(value = "/greeting")
    public String greeting() {
        return "Hello dev";
    }

    @GetMapping(value = "/greeting2")
    public String greeting2() {
        return "Hello2";
    }
}
