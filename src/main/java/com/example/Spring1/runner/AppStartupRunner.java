package com.example.Spring1.runner;

import com.example.Spring1.Bean.ChefBean;
import com.example.Spring1.Bean.DeliveryServiceBean;
import com.example.Spring1.Bean.OrderProcessorBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
class AppStartupRunner implements ApplicationRunner {

    private final OrderProcessorBean orderProcessorBean;
    @Autowired
    private DeliveryServiceBean deliveryServiceBean;
    private ChefBean chefBean;

    // 생성자 주입
    @Autowired
    public AppStartupRunner(OrderProcessorBean orderProcessorBean) {
        this.orderProcessorBean = orderProcessorBean;
    }

    @Autowired
    public void setChefBean(ChefBean chefBean) {
        this.chefBean = chefBean;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("=== 주문 처리 시작 ===");
        orderProcessorBean.processOrder();

        System.out.println("=== 요리 시작 ===");
        chefBean.cook();

        System.out.println("=== 배달 시작 ===");
        deliveryServiceBean.deliver();
    }
}
