package com.kadai.kadai6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello hello";
    }

    @GetMapping("/cars")
    public CarResponse car() {
        return new CarResponse("mark x", "white", 300);
    }
}
