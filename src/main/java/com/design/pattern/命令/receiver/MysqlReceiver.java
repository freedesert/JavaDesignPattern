package com.design.pattern.命令.receiver;

/*******************************************************************************
 * 版权信息：博睿宏远科技发展有限公司
 * Copyright: Copyright (c) 2007博睿宏远科技发展有限公司,Inc.All Rights Reserved.
 *
 * @date 2018-10-18 下午 2:59 
 * @author: <a href=mailto:huangyr@bonree.com>黄跃然</a>
 * @Description:
 ******************************************************************************/
public class MysqlReceiver implements Receiver{

    public void createData() {
        System.out.println("create data. --Mysql");
    }

    public void deleteData() {
        System.out.println("delete data. --Mysql");
    }

    public void updateDate() {
        System.out.println("update data. --Mysql");
    }

    public void selectData() {
        System.out.println("select data. --Mysql");
    }

}
