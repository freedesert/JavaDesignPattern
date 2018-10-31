package com.design.pattern.桥接.dbservice;


import com.design.pattern.桥接.connection.DBConnection;

/*******************************************************************************
 *
 * @date 2018-10-16 下午 2:09
 * @author: <a href=mailto:huangyr>黄跃然</a>
 * @Description: 数据库Service 数据库维度扩展
 ******************************************************************************/
public abstract class DBService {

    protected DBConnection connection;

    public DBService(DBConnection connection) {
        this.connection = connection;
    }

    public abstract String getDBData();

}
