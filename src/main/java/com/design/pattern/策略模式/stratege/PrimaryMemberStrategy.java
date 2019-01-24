package com.design.pattern.策略模式.stratege;

/*******************************************************************************
 * @date 2019-01-24 上午 10:48
 * @author: <a href=mailto:>黄跃然</a>
 * @Description: 初级会员策略 优惠10%
 ******************************************************************************/
public class PrimaryMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double price) {
        return price * 0.9;
    }
}
