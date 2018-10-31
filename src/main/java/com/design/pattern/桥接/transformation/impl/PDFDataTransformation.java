package com.design.pattern.桥接.transformation.impl;

import com.design.pattern.桥接.transformation.DataTransformation;

/*******************************************************************************
 *
 * @date 2018-10-16 下午 2:13 
 * @author: <a href=mailto:huangyr>黄跃然</a>
 * @Description: 数据转换扩展类 PDF支持
 ******************************************************************************/
public class PDFDataTransformation extends DataTransformation {

    @Override
    public String transformation() {
        String dbData = dbService.getDBData();
        return "pdf-" + dbData;
    }
}
