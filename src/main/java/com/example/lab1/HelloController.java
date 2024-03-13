package com.example.lab1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model) {
        String message = "Hello, World!";
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        model.addAttribute("message", message);
        model.addAttribute("names", names);
        return "hello";
    }
}