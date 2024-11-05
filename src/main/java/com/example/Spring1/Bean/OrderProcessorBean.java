package com.example.Spring1.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderProcessorBean {

    private final OrderReceiverBean orderReceiverBean;
    private final PaymentProcessorBean paymentProcessorBean;

    public OrderProcessorBean(OrderReceiverBean orderReceiverBean, PaymentProcessorBean paymentProcessorBean) {
        this.orderReceiverBean = orderReceiverBean;
        this.paymentProcessorBean = paymentProcessorBean;
    }

    public void processOrder() {
        orderReceiverBean.receiveOrder();
        paymentProcessorBean.processPayment();
    }
}
