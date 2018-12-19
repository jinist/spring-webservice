package com.jinist.webservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WEbRestController {
    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }
}
