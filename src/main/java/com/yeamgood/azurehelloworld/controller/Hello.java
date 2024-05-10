package com.yeamgood.azurehelloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping(value = "/greeting")
    public String greeting() {
        System.out.println("yeamgood test sysout print");
        return "Hello test sysout";
    }

    @GetMapping(value = "/greeting2")
    public String greeting2() {
        return "Hello2";
    }
}
