package com.example.Spring1.Bean;

import org.springframework.stereotype.Component;

@Component
public class PaymentProcessorBean {
    public void processPayment(){
        System.out.println("결제 처리를 합니다.");
    }
}
