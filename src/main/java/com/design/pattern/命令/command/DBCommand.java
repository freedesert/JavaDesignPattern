package com.design.pattern.命令.command;

import com.design.pattern.命令.receiver.Receiver;

/*******************************************************************************
 * 版权信息：博睿宏远科技发展有限公司
 * Copyright: Copyright (c) 2007博睿宏远科技发展有限公司,Inc.All Rights Reserved.
 *
 * @date 2018-10-18 下午 2:59 
 * @author: <a href=mailto:huangyr@bonree.com>黄跃然</a>
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
