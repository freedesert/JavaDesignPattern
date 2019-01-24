package com.design.pattern.策略模式.stratege;

/*******************************************************************************
 * @date 2019-01-24 上午 10:48
 * @author: <a href=mailto:>黄跃然</a>
 * @Description: 中级会员策略 优惠50%
 ******************************************************************************/
public class IntermediateMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double price) {
        return price * 0.5;
    }
}
