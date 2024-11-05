package com.example.Spring1.Bean;

import org.springframework.stereotype.Component;

@Component
public class DeliveryServiceBean {
    public void deliver(){
        System.out.println("배달을 합니다.");
    }
}
