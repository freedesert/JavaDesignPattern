package com.design.pattern.单例;

/*******************************************************************************
 *
 * @date 2018-10-16 上午 11:12 
 * @author: <a href=mailto:huangyr@.com>黄跃然</a>
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
