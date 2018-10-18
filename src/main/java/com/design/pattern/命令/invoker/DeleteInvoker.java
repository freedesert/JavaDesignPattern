package com.design.pattern.命令.invoker;

import com.design.pattern.命令.command.Command;

// delete
public class DeleteInvoker {
    /**
     * 持有命令对象
     */
    private Command command = null;
    /**
     * 构造方法
     */
    public DeleteInvoker(Command command){
        this.command = command;
    }

    /**
     * 执行方法
     */
    public void execute(){
        command.delete();
    }
}