package com.example.caching.caffeinecachedemo.service;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@CacheConfig(cacheNames = "test")
@Service
public class CachedServiceImpl implements CachedService {
    @Cacheable
    @Override
    public String sayHello(String x, String name) {
        return String.format("Hello, %s", name);
    }
}
