package com.design.pattern.单例;

/*******************************************************************************
 * 版权信息：博睿宏远科技发展有限公司
 * Copyright: Copyright (c) 2007博睿宏远科技发展有限公司,Inc.All Rights Reserved.
 *
 * @date 2018-10-16 上午 11:12 
 * @author: <a href=mailto:huangyr@bonree.com>黄跃然</a>
 * @Description:
 ******************************************************************************/
public class Test {

    public static void main(String[] args) {
        EnumSingleton.INSTANCE.doSomeThing();
        EnumSingleton.INSTANCE.doSomeThing();

        System.out.println(DoubleLockSingleton.getInstance().toString());
        System.out.println(DoubleLockSingleton.getInstance().toString());
    }

}
