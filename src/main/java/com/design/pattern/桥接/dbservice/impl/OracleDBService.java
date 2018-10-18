package com.design.pattern.桥接.dbservice.impl;

import com.design.pattern.桥接.connection.DBConnection;
import com.design.pattern.桥接.connection.impl.OracleConnection;
import com.design.pattern.桥接.dbservice.DBService;

/*******************************************************************************
 *
 * @date 2018-10-16 下午 2:24 
 * @author: <a href=mailto:huangyr@.com>黄跃然</a>
 * @Description:
 ******************************************************************************/
public class OracleDBService extends DBService {
    public OracleDBService(OracleConnection connection) {
        super(connection);
    }

    @Override
    public String getDBData() {
        return connection.getData();
    }
}
