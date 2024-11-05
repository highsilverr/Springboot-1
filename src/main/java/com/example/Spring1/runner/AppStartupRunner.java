package com.example.Spring1.runner;

import com.example.Spring1.Bean.ChefBean;
import com.example.Spring1.Bean.DeliveryServiceBean;
import com.example.Spring1.Bean.OrderProcessorBean;
import com.example.Spring1.Bean.PaymentProcessorBean;
import com.example.Spring1.Messages.AppMessages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnBean({OrderProcessorBean.class, PaymentProcessorBean.class})
class AppStartupRunner implements ApplicationRunner {

    private final OrderProcessorBean orderProcessorBean;
    private final DeliveryServiceBean deliveryServiceBean;
    private final ChefBean chefBean;
    private final AppMessages appMessages;

    @Value("${app.messages.orderStart}")
    private String orderStartMessage;

    @Value("${app.messages.cookingStart}")
    private String cookingStartMessage;

    @Value("${app.messages.deliveryStart}")
    private String deliveryStartMessage;

    @Autowired
    public AppStartupRunner(OrderProcessorBean orderProcessorBean, DeliveryServiceBean deliveryServiceBean,
                            ChefBean chefBean, AppMessages appMessages) {
        this.orderProcessorBean = orderProcessorBean;
        this.deliveryServiceBean = deliveryServiceBean;
        this.chefBean = chefBean;
        this.appMessages = appMessages;
    }

    @Override
    public void run(ApplicationArguments args) {
        // Using @ConfigurationProperties for AppMessages
        System.out.println(appMessages.getOrderStart());
        orderProcessorBean.processOrder();

        System.out.println(appMessages.getCookingStart());
        chefBean.cook();

        System.out.println(appMessages.getDeliveryStart());
        deliveryServiceBean.deliver();

        System.out.println(orderStartMessage);
        System.out.println(cookingStartMessage);
        System.out.println(deliveryStartMessage);
    }
}
