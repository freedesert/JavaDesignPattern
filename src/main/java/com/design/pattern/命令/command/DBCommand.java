package com.design.pattern.命令.command;

import com.design.pattern.命令.receiver.Receiver;

/*******************************************************************************
 *
 * @date 2018-10-18 下午 2:59 
 * @author: <a href=mailto:huangyr@.com>黄跃然</a>
 * @Description:
 ******************************************************************************/
public class DBCommand implements Command {

    private Receiver receiver;

    public DBCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void create() {
        receiver.createData();
    }

    @Override
    public void delete() {
        receiver.deleteData();
    }

    @Override
    public void update() {
        receiver.updateDate();
    }

    @Override
    public void select() {
        receiver.selectData();
    }
}
