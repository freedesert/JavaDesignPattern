package com.design.pattern.迭代.黑箱聚集与内禀迭代子;

public abstract class Aggregate {
    /**
     * 工厂方法，创建相应迭代子对象的接口
     */
    public abstract Iterator iterator();
}