package com.design.pattern.桥接.connection;

/*******************************************************************************
 * 版权信息：博睿宏远科技发展有限公司
 * Copyright: Copyright (c) 2007博睿宏远科技发展有限公司,Inc.All Rights Reserved.
 *
 * @date 2018-10-16 下午 2:16 
 * @author: <a href=mailto:huangyr@bonree.com>黄跃然</a>
 * @Description: 数据库连接配置
 ******************************************************************************/
public interface DBConnection {

    // 数据库连接配置信息
    public String data = "oracle data";

    public String getData();

    public void setData(String data);
}
