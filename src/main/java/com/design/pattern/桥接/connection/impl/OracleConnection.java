package com.design.pattern.桥接.connection.impl;

import com.design.pattern.桥接.connection.DBConnection;

/*******************************************************************************
 *
 * @date 2018-10-16 下午 2:21 
 * @author: <a href=mailto:huangyr@.com>黄跃然</a>
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
