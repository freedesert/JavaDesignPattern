package com.design.pattern.桥接.transformation.impl;

import com.design.pattern.桥接.transformation.DataTransformation;

/*******************************************************************************
 * 版权信息：博睿宏远科技发展有限公司
 * Copyright: Copyright (c) 2007博睿宏远科技发展有限公司,Inc.All Rights Reserved.
 *
 * @date 2018-10-16 下午 2:13 
 * @author: <a href=mailto:huangyr@bonree.com>黄跃然</a>
 * @Description: 数据转换扩展类 TXT支持
 ******************************************************************************/
public class TXTDataTransformation extends DataTransformation {
    @Override
    public String transformation() {
        String dbData = dbService.getDBData();
        return "txt-" + dbData;
    }
}
