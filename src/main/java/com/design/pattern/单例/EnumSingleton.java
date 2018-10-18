package com.design.pattern.单例;

/*******************************************************************************
 *
 * @date 2018-10-16 上午 11:07
 * @author: <a href=mailto:huangyr@.com>黄跃然</a>
 * @Description: 枚举单例
 ******************************************************************************/
public enum EnumSingleton {

    INSTANCE;

    public void doSomeThing() {
        System.out.println("doSomeThing.   " + this.hashCode());
    }

}
