package com.example.RuleEngine.order;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class orderController {

    @Autowired
    private KieSession session;

    @PostMapping("/order")
    public Order order(@RequestBody Order order){
        session.insert(order);
        Order a = new Order();
        session.insert(a);
        System.out.println("Discount:" + order.getDiscount());
        session.fireAllRules();
        System.out.println(order.getDiscount());
        return order;
    }

}
