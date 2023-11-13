package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class Api {
    @PostMapping("/hello")
    public String hello(@RequestBody HashMap<String, String> map) {
        System.out.println(map.get("name"));
        return "Hello World!";
    }

    @GetMapping("/hello1")
    @ResponseBody
    public String hello() {
        System.out.println("hello1");
        return "Hello World!";
    }

}
