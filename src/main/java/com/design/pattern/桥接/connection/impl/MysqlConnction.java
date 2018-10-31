package com.design.pattern.桥接.connection.impl;

import com.design.pattern.桥接.connection.DBConnection;

/*******************************************************************************
 *
 * @date 2018-10-16 下午 2:20 
 * @author: <a href=mailto:huangyr>黄跃然</a>
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
