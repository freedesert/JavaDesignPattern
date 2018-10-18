package com.design.pattern.桥接.connection.impl;

import com.design.pattern.桥接.connection.DBConnection;

/*******************************************************************************
 * 版权信息：博睿宏远科技发展有限公司
 * Copyright: Copyright (c) 2007博睿宏远科技发展有限公司,Inc.All Rights Reserved.
 *
 * @date 2018-10-16 下午 2:20 
 * @author: <a href=mailto:huangyr@bonree.com>黄跃然</a>
 * @Description: Mysql连接
 ******************************************************************************/
public class MysqlConnction implements DBConnection {

    private String data="mysql data";

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
