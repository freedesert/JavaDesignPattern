package com.design.pattern.桥接;

import com.design.pattern.桥接.connection.impl.RedisConnction;
import com.design.pattern.桥接.dbservice.impl.RedisDBService;
import com.design.pattern.桥接.transformation.DataTransformation;
import com.design.pattern.桥接.transformation.impl.PDFDataTransformation;

/*******************************************************************************
 * 版权信息：博睿宏远科技发展有限公司
 * Copyright: Copyright (c) 2007博睿宏远科技发展有限公司,Inc.All Rights Reserved.
 *
 * @date 2018-10-16 下午 2:43 
 * @author: <a href=mailto:huangyr@bonree.com>黄跃然</a>
 * @Description: 桥接模式
 ******************************************************************************/
public class Main {

    public static void main(String[] args) {
        DataTransformation transformation = new PDFDataTransformation();
        transformation.setDbService(new RedisDBService(new RedisConnction()));
        String result = transformation.transformation();
        System.out.println(result);
    }

}
