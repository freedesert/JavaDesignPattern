package com.design.pattern.建造者;

public class Client {

    public static void main(String[] args) {
        Builder builder = new WelcomeBuilder();
        Director director = new Director(builder);
        director.construct("toAddress@126.com", "fromAddress@126.com");

        Builder builder1 = new GoodbyeBuilder();
        Director director1=new Director(builder1);
        director1.construct("toAddress@126.com", "fromAddress@126.com");
    }

}