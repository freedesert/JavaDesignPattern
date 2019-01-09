package com.design.pattern.观察者模式.observer;

/*******************************************************************************
 * @date 2019-01-09 下午 3:04
 * @author: <a href=mailto:>黄跃然</a>
 * @Description: 具体观察者
 ******************************************************************************/
public class ConcreteObserver extends Observer {

    public ConcreteObserver(String name) {
        super(name);
    }

    @Override
    public void update(String state) {
        System.out.println("观察值状态更新." + getName()+" " + getState() + " --> " + state);
        setState(state);
    }

}
