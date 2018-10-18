package com.design.pattern.代理.staticproxy;

public class UserDao implements DAOInterface{

    @Override
    public void add() {
        System.out.println("在目标对象中执行add");
    }

    @Override
    public void delete() {
        System.out.println("在目标对象中执行delete");
    }

    @Override
    public void update() {
        System.out.println("在目标对象中执行update");
    }

    @Override
    public void query() {
        System.out.println("在目标对象中执行query");
    }

}