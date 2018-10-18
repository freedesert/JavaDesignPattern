package com.design.pattern.单例;

/*******************************************************************************
 * 版权信息：博睿宏远科技发展有限公司
 * Copyright: Copyright (c) 2007博睿宏远科技发展有限公司,Inc.All Rights Reserved.
 *
 * @date 2018-10-16 上午 11:07 
 * @author: <a href=mailto:huangyr@bonree.com>黄跃然</a>
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
