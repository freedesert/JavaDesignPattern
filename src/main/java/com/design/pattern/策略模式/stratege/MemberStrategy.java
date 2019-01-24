package com.design.pattern.策略模式.stratege;

/*******************************************************************************
 * @date 2019-01-24 上午 10:36
 * @author: <a href=mailto:>黄跃然</a>
 * @Description: 会员优惠策略抽象接口
 ******************************************************************************/
public interface MemberStrategy {

    /**
     * 计算会员价格
     * @return
     */
    public double calcPrice(double price);

}
