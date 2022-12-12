package com.barzykin.personal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/personal")
    public String sayHello() {
        return "Hello";
    }
}
