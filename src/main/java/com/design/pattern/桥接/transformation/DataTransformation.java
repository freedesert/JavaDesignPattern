package com.design.pattern.桥接.transformation;

import com.design.pattern.桥接.dbservice.DBService;

/*******************************************************************************
 * 版权信息：博睿宏远科技发展有限公司
 * Copyright: Copyright (c) 2007博睿宏远科技发展有限公司,Inc.All Rights Reserved.
 *
 * @date 2018-10-16 下午 2:09 
 * @author: <a href=mailto:huangyr@bonree.com>黄跃然</a>
 * @Description: 数据转换类 转换类型扩展
 ******************************************************************************/
public abstract class DataTransformation {

    protected DBService dbService; // 数据库维度扩展


    public DBService getDbService() {
        return dbService;
    }

    public void setDbService(DBService dbService) {
        this.dbService = dbService;
    }

    public abstract String transformation();
}
