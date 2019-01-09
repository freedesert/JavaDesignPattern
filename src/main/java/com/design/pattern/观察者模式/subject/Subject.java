package com.design.pattern.观察者模式.subject;

import com.design.pattern.观察者模式.observer.Observer;

import java.util.HashMap;
import java.util.Map;

/*******************************************************************************
 * @date 2019-01-09 下午 2:51
 * @author: <a href=mailto:>黄跃然</a>
 * @Description: 抽象主题 负责保存观察者对象集合、添加删除观察者、通知观察者。
 ******************************************************************************/
public abstract class Subject {

    private Map<String, Observer> observerMap = new HashMap<String, Observer>();

    // 主题状态
    private String state;

    public Subject(String state) {
        this.state = state;
    }

    /**
     * 注册观察者
     */
    public void register(Observer observer) {
        observer.setState(getState());
        observerMap.put(observer.getName(), observer);
    }

    /**
     * 注销观察者
     */
    public void cancel(String observerName) {
        observerMap.remove(observerName);
    }

    /**
     * 主题发送变化 通知所有观察者
     */
    void notify(String state) {
        for (Map.Entry<String, Observer> observerEntry : observerMap.entrySet()) {
            observerEntry.getValue().update(state);
        }
    }

    public String getState() {
        return state;
    }

    protected void setState(String state) {
        this.state = state;
    }

    /**
     * 改变主题状态
     * @param state
     */
    public abstract void change(String state);
}
