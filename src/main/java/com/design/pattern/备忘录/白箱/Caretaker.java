package com.design.pattern.备忘录.白箱;

/**
 * 负责人
 * 1.负责保存备忘录对象。不检查备忘录对象的内容。
 */
public class Caretaker {

    private Memento memento;
    /**
     * 备忘录的取值方法
     */
    public Memento retrieveMemento(){
        return this.memento;
    }
    /**
     * 备忘录的赋值方法
     */
    public void saveMemento(Memento memento){
        this.memento = memento;
    }
}