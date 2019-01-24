package com.design.pattern.策略模式;

import com.design.pattern.策略模式.stratege.MemberStrategy;

/*******************************************************************************
 * @date 2019-01-24 上午 10:55
 * @author: <a href=mailto:>黄跃然</a>
 * @Description:
 ******************************************************************************/
public class PriceManager {

    private MemberStrategy strategy; // 会员策略

    public PriceManager(MemberStrategy strategy) {
        this.strategy = strategy;
    }

    public double getMemberPrice(double price) {
        return strategy.calcPrice(price);
    }
}
