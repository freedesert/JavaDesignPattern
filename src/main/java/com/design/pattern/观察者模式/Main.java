package com.design.pattern.观察者模式;

import com.design.pattern.观察者模式.observer.ConcreteObserver;
import com.design.pattern.观察者模式.observer.Observer;
import com.design.pattern.观察者模式.subject.ConcreteSubject;
import com.design.pattern.观察者模式.subject.Subject;

/*******************************************************************************
 * @date 2019-01-09 下午 2:50
 * @author: <a href=mailto:>黄跃然</a>
 * @Description: 观察者模式
 ******************************************************************************/
public class Main {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject("init");

        Observer observerA = new ConcreteObserver("Observer A");
        Observer observerB = new ConcreteObserver("Observer B");

        subject.register(observerA);
        subject.register(observerB);

        subject.change("start run.");
    }

}
