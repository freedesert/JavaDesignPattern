package com.design.pattern.桥接.transformation.impl;

import com.design.pattern.桥接.transformation.DataTransformation;

/*******************************************************************************
 *
 * @date 2018-10-16 下午 2:13 
 * @author: <a href=mailto:huangyr@.com>黄跃然</a>
 * @Description: 数据转换扩展类 XML支持
 ******************************************************************************/
public class XMLDataTransformation extends DataTransformation {
    @Override
    public String transformation() {
        String dbData = dbService.getDBData();
        return "xml-" + dbData;
    }
}
