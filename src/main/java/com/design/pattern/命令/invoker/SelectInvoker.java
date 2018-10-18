package com.design.pattern.命令.invoker;

import com.design.pattern.命令.command.Command;

// select
public class SelectInvoker {
    /**
     * 持有命令对象
     */
    private Command command = null;
    /**
     * 构造方法
     */
    public SelectInvoker(Command command){
        this.command = command;
    }

    /**
     * 执行方法
     */
    public void execute(){
        command.select();
    }
}