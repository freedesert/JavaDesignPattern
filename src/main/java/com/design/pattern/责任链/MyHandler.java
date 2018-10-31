package com.design.pattern.责任链;

/*******************************************************************************
 *
 * @date 2018-10-18 下午 2:33 
 * @author: <a href=mailto:huangyr>黄跃然</a>
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
