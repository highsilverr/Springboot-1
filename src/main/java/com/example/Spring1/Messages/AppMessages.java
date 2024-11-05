package com.example.Spring1.Messages;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app.messages")
public class AppMessages {
    private String orderStart;
    private String cookingStart;
    private String deliveryStart;

    // Getters and setters
    public String getOrderStart() {
        return orderStart;
    }
    public void setOrderStart(String orderStart) {
        this.orderStart = orderStart;
    }

    public String getCookingStart() {
        return cookingStart;
    }
    public void setCookingStart(String cookingStart) {
        this.cookingStart = cookingStart;
    }

    public String getDeliveryStart() {
        return deliveryStart;
    }
    public void setDeliveryStart(String deliveryStart) {
        this.deliveryStart = deliveryStart;
    }
}
