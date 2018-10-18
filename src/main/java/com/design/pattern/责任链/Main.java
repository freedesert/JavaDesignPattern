package com.design.pattern.责任链;

/*******************************************************************************
 *
 * @date 2018-10-18 下午 2:37 
 * @author: <a href=mailto:huangyr@.com>黄跃然</a>
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
