package com.example.RuleEngine.order;

import org.springframework.stereotype.Component;

@Component
public class Order {
    private String name;
    private String cardType;
    private int discount;
    private int price;

    public Order() {
    }

    public Order(String name, String cardType, int discount, int price) {
        this.name = name;
        this.cardType = cardType;
        this.discount = discount;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
