package com.example.demo.api.controller;

import com.example.demo.core.service.DemoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
public class DemoController {
    private final DemoService demoService;

    @GetMapping("/runtime")
    public String getRuntimeTimes() {
        log.info("Getting runtime times");
        return demoService.getRuntimeTimes();
    }

    @GetMapping("/")
    public String home() {
        return "Welcome to demo web application!";
    }
}
