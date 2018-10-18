package com.design.pattern.责任链;

/*******************************************************************************
 *
 * @date 2018-10-18 下午 2:30 
 * @author: <a href=mailto:huangyr@.com>黄跃然</a>
 * @Description:
 ******************************************************************************/
public abstract class AbstractHandler {

    private Handler handler; // 下一个待处理的handler引用

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
