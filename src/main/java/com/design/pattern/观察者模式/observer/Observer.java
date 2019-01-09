package com.design.pattern.观察者模式.observer;

/**
 * 抽象观察者接口
 */
public abstract class Observer {

    private String name;

    private String state;

    public Observer(String name) {
        this.name = name;
    }

    /**
     * 更新自身状态
     */
    public abstract void update(String state);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
