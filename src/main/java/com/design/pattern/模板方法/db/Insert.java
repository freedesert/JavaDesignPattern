package com.design.pattern.模板方法.db;

import com.design.pattern.模板方法.vo.CalcResult;

import java.util.HashMap;
import java.util.Map;

/*******************************************************************************
 * @date 2019-01-28 上午 11:16
 * @author: <a href=mailto:>黄跃然</a>
 * @Description: 数据入库 模板抽象类
 ******************************************************************************/
public abstract class Insert {

    private Map<String, String> defaultConfig = new HashMap<>();

    // 入库执行结果

    // 入库对象
    private CalcResult calcResult;

    public CalcResult getCalcResult() {
        return calcResult;
    }

    public void setCalcResult(CalcResult calcResult) {
        this.calcResult = calcResult;
    }

    public Map<String, String> getDefaultConfig() {
        return defaultConfig;
    }


    Map<String, String> initDefaultConfig() {
        defaultConfig.put("db.type", "mysql");
        defaultConfig.put("user", "root");
        defaultConfig.put("pwd", "root");
        return defaultConfig;
    }

    /**
     * 初始化配置
     */
    public Map<String, String> initConfig(Map<String, String> config) {
        try {
            if (config != null) {
                System.out.println("doing config init......");
                Thread.sleep(1000);
                System.out.println("init config success.");
                return defaultConfig;
            } else {
                throw new NullPointerException();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 配置设置模板
     * @param defaultConfig
     * @return
     */
    public abstract Map<String, String> open(Map<String, String> defaultConfig);

    /**
     * 执行入库模板
     * @param calcResult
     * @return
     */
    public abstract boolean doInsert(CalcResult calcResult);

    /**
     * 入库成功回调模板
     * @param result
     */
    public abstract void doSuccess(CalcResult result);

    /**
     * 入库失败回调模板
     * @param result
     */
    public abstract void doFailed(CalcResult result);

    public void prepare(Map<String, String> config) {
        try {
            System.out.println("prepare ......");
            System.out.println("config:" + config.toString());
            Thread.sleep(1000);
            System.out.println("prepare success.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 执行入库逻辑 对执行结果进行回调
     *
     * @return
     */
    public final void execute() {
        try {
            Map<String, String> defaultConfig = initDefaultConfig();
            Map<String, String> config = open(defaultConfig);
            Map<String, String> conf = initConfig(config);
            prepare(conf);
            boolean result = doInsert(calcResult);
            if (result) {
                // success
                doSuccess(calcResult);
            } else {
                // failed
                doFailed(calcResult);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
