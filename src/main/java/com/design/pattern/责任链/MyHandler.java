package com.design.pattern.责任链;

/*******************************************************************************
 * 版权信息：博睿宏远科技发展有限公司
 * Copyright: Copyright (c) 2007博睿宏远科技发展有限公司,Inc.All Rights Reserved.
 *
 * @date 2018-10-18 下午 2:33 
 * @author: <a href=mailto:huangyr@bonree.com>黄跃然</a>
 * @Description:
 ******************************************************************************/
public class MyHandler extends AbstractHandler implements Handler {


    private String name;


    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void invoke() {
        // 处理当前handler逻辑
        System.out.println(name + "is hand...");

        // 调用下一个handler
        if (getHandler() != null) {
            getHandler().invoke();
        }
    }
}
