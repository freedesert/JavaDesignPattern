package com.design.pattern.模板方法.db.impl;

import com.design.pattern.模板方法.db.Insert;
import com.design.pattern.模板方法.vo.CalcResult;

import java.util.Map;

/*******************************************************************************
 * @date 2019-01-28 上午 11:21
 * @author: <a href=mailto:>黄跃然</a>
 * @Description: 模板方法具体实现类 入NFS
 ******************************************************************************/
public class InsertNFS extends Insert {
    @Override
    public Map<String, String> open(Map<String, String> defaultConfig) {
        defaultConfig.put("db.type","nfs");
        return defaultConfig;
    }

    @Override
    public boolean doInsert(CalcResult calcResult) {
        try {
            System.out.println("init nfs success.");
            System.out.println("insert to nfs. calcResult:"+ calcResult.toString());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void doSuccess(CalcResult result) {
        System.out.println("insert nfs success. result:"+result.toString());
        System.out.println("===========================================");
    }

    @Override
    public void doFailed(CalcResult result) {
        System.out.println("insert nfs failed. result:"+result.toString());
        System.out.println("===========================================");
    }

}
