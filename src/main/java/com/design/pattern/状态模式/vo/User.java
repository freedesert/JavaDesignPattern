package com.design.pattern.状态模式.vo;

import java.util.Objects;

/*******************************************************************************
 * @date 2019-01-24 上午 9:47
 * @author: <a href=mailto:>黄跃然</a>
 * @Description:
 ******************************************************************************/
public class User {

    private String name;

    private int age;

    // 用户状态 0 正常 1 禁用
    private int state;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.state = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return age == user.age &&
                state == user.state &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, state);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", state=" + state +
                '}';
    }
}
