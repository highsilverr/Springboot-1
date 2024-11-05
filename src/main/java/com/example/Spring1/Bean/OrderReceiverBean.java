package com.example.Spring1.Bean;

import org.springframework.stereotype.Component;

@Component
public class OrderReceiverBean {
    public void receiveOrder() {
        System.out.println("주문을 받습니다.");
    }
}
