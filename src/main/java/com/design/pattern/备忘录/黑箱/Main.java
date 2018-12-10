package com.design.pattern.备忘录.黑箱;

/*******************************************************************************
 * @date 2018-12-10 上午 10:35
 * @author: <a href=mailto:>黄跃然</a>
 * @Description: 黑箱备忘录模式
 ******************************************************************************/
public class Main {

    public static void main(String[] args) {
        Originator o = new Originator(); // 发起人
        Caretaker c = new Caretaker(); // 负责人

        try {
            o.setState("start 1");
            c.saveMemento(o.createMemento());

            o.setState("start 2");
            c.saveMemento(o.createMemento());

            o.setState("start 3");
            throw new Exception(); // 操作失败
        } catch (Exception e) {
            // 操作失败 进行回退操作
            o.restoreMemento(c.retrieveMemento());
        }

        System.out.println(o.getState()); // 获取状态
    }

}
