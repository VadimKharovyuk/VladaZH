package com.example.vladazh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePage {
    @GetMapping
    public String HomePage() {
        return "index";
    }
}
