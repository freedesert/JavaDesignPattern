package com.design.pattern.桥接.connection.impl;

import com.design.pattern.桥接.connection.DBConnection;

/*******************************************************************************
 *
 * @date 2018-10-16 下午 2:21 
 * @author: <a href=mailto:huangyr@.com>黄跃然</a>
 * @Description: Redis连接
 ******************************************************************************/
public class RedisConnction  implements DBConnection {

    private String data="redis data";

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
