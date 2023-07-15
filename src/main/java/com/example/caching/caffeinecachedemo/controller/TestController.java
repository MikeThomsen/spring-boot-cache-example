package com.example.caching.caffeinecachedemo.controller;

import com.example.caching.caffeinecachedemo.service.CachedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private CachedService cachedService;

    @GetMapping("/api/test/hello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        System.out.println("\n\n\n");
        return cachedService.sayHello(null, name);
    }
}
