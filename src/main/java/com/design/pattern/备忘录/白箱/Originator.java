package com.design.pattern.备忘录.白箱;

/**
 * 发起人
 * 让系统支持回滚
 * 1.创建一个备忘录对象保存自身信息
 */
public class Originator {

    private String state;
    /**
     * 工厂方法，返回一个新的备忘录对象
     */
    public Memento createMemento(){
        return new Memento(state);
    }
    /**
     * 将发起人恢复到备忘录对象所记载的状态
     * 回滚操作
     */
    public void restoreMemento(Memento memento){
        this.state = memento.getState();
    }
    
    public String getState() {
        return state;
    }
    
    public void setState(String state) {
        this.state = state;
        System.out.println("当前状态：" + this.state);
    }
    
}