package com.design.pattern.模板方法.vo;

/*******************************************************************************
 * @date 2019-01-28 上午 11:19
 * @author: <a href=mailto:>黄跃然</a>
 * @Description: 业务计算结果对象
 ******************************************************************************/
public class CalcResult {

    // 业务类型
    private int bizType;

    // 业务数据计算结果
    private String result;

    public CalcResult(int bizType, String result) {
        this.bizType = bizType;
        this.result = result;
    }

    public int getBizType() {
        return bizType;
    }

    public void setBizType(int bizType) {
        this.bizType = bizType;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "CalcResult{" +
                "bizType=" + bizType +
                ", result='" + result + '\'' +
                '}';
    }
}
