package com.design.pattern.桥接.connection;

/*******************************************************************************
 *
 * @date 2018-10-16 下午 2:16 
 * @author: <a href=mailto:huangyr@.com>黄跃然</a>
 * @Description: 数据库连接配置
 ******************************************************************************/
public interface DBConnection {

    // 数据库连接配置信息
    public String data = "oracle data";

    public String getData();

    public void setData(String data);
}
