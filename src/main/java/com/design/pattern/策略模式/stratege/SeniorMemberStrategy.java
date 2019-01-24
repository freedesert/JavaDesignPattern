package com.design.pattern.策略模式.stratege;

/*******************************************************************************
 * @date 2019-01-24 上午 10:48
 * @author: <a href=mailto:>黄跃然</a>
 * @Description: 高级会员策略 全部1元
 ******************************************************************************/
public class SeniorMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double price) {
        return 1;
    }
}
