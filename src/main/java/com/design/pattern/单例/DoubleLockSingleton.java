package com.design.pattern.单例;

/*******************************************************************************
 *
 * @date 2018-10-16 上午 11:07 
 * @author: <a href=mailto:huangyr>黄跃然</a>
 * @Description: 单例双锁
 ******************************************************************************/
public class DoubleLockSingleton {

    private volatile static DoubleLockSingleton singleton = null;

    private DoubleLockSingleton() {
    }

    public static DoubleLockSingleton getInstance() {
        if (singleton == null) {
            synchronized (DoubleLockSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleLockSingleton();
                }
            }
        }
        return singleton;
    }

}
