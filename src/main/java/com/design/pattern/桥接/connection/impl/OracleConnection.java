package com.design.pattern.桥接.connection.impl;

import com.design.pattern.桥接.connection.DBConnection;

/*******************************************************************************
 * 版权信息：博睿宏远科技发展有限公司
 * Copyright: Copyright (c) 2007博睿宏远科技发展有限公司,Inc.All Rights Reserved.
 *
 * @date 2018-10-16 下午 2:21 
 * @author: <a href=mailto:huangyr@bonree.com>黄跃然</a>
 * @Description: Oracle连接
 ******************************************************************************/
public class OracleConnection implements DBConnection {

    private String data="oracle data";

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
