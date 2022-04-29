package com.epsagon.springboot;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Hello {
    @RequestMapping("/")
    String home() {
        return "Hello World from Kubernetes!";
    }
}