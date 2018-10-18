package com.design.pattern.责任链;

/*******************************************************************************
 * 版权信息：博睿宏远科技发展有限公司
 * Copyright: Copyright (c) 2007博睿宏远科技发展有限公司,Inc.All Rights Reserved.
 *
 * @date 2018-10-18 下午 2:37 
 * @author: <a href=mailto:huangyr@bonree.com>黄跃然</a>
 * @Description:
 ******************************************************************************/
public class Main {

    public static void main(String[] args) {

        MyHandler handler1 = new MyHandler("process handler");
        MyHandler handler2 = new MyHandler("login handler");
        MyHandler handler3 = new MyHandler("filter handler");
        handler3.setHandler(handler2);
        handler2.setHandler(handler1);

        handler3.invoke();
    }

}
