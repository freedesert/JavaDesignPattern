package com.design.pattern.命令.invoker;

import com.design.pattern.命令.command.Command;

// update
public class UpdateInvoker {
    /**
     * 持有命令对象
     */
    private Command command = null;
    /**
     * 构造方法
     */
    public UpdateInvoker(Command command){
        this.command = command;
    }

    /**
     * 执行方法
     */
    public void execute(){
        command.update();
    }
}