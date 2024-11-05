package com.example.Spring1.Bean;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Component;

public class ChefBean {
    public void cook() {
        System.out.println("요리 합니다.");
    }
}
