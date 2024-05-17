package com.example.demo.api.controller;

import com.example.demo.core.service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class DemoController {
    private final DemoService demoService;

    @GetMapping("/runtime")
    public String getRuntimeTimes() {
        return demoService.getRuntimeTimes();
    }

    @GetMapping("/")
    public String home() {
        return "Welcome to demo web application!";
    }
}
