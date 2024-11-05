package com.example.Spring1.config;

import com.example.Spring1.Bean.ChefBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class BeanConfig {

    private ChefBean chefBean;

    @Bean
    public ChefBean chefBean() {
        return new ChefBean();
    }
}