package com.hyungee.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopApplication.class, args);
        Friend test = new Friend("park");
        System.out.println(test.name);
    }

}

class Friend {
    String name;
    int age = 20;

    Friend(String 구멍) {
        this.name = "kim";
        this.name = 구멍;
    }
}


