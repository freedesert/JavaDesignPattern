package com.design.pattern.命令;

import com.design.pattern.命令.command.Command;
import com.design.pattern.命令.command.DBCommand;
import com.design.pattern.命令.invoker.CreateInvoker;
import com.design.pattern.命令.invoker.DeleteInvoker;
import com.design.pattern.命令.invoker.SelectInvoker;
import com.design.pattern.命令.invoker.UpdateInvoker;
import com.design.pattern.命令.receiver.OracleReceiver;
import com.design.pattern.命令.receiver.Receiver;

public class Main {

    public static void main(String[] args) {

        //创建不同的执行者
        // Receiver receiver = new MysqlReceiver();
        Receiver receiver = new OracleReceiver();

        //创建命令对象，设定它的执行者。 通过命令去调用执行者的方法
        Command command = new DBCommand(receiver);

        //创建请求者，设置指令，执行
        new CreateInvoker(command).execute();
        new SelectInvoker(command).execute();
        new DeleteInvoker(command).execute();
        new UpdateInvoker(command).execute();

    }

}