package com.design.pattern.观察者模式.subject;

/*******************************************************************************
 * @date 2019-01-09 下午 3:04
 * @author: <a href=mailto:>黄跃然</a>
 * @Description: 具体主题 当改变主题状态，通知观察值。
 ******************************************************************************/
public class ConcreteSubject extends Subject {

    public ConcreteSubject(String state) {
        super(state);
    }

    @Override
    public void change(String state) {
        System.out.println("主题状态改变:" + getState() + " --> " + state);
        setState(state);
        notify(getState());
    }
}
