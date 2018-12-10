package com.design.pattern.备忘录.白箱;

/**
 * 备忘录对象
 */
public class Memento {
    
    private String state;
    
    public Memento(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
}