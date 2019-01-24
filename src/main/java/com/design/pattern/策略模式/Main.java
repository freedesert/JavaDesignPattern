package com.design.pattern.策略模式;

import com.design.pattern.策略模式.stratege.IntermediateMemberStrategy;
import com.design.pattern.策略模式.stratege.MemberStrategy;
import com.design.pattern.策略模式.stratege.PrimaryMemberStrategy;
import com.design.pattern.策略模式.stratege.SeniorMemberStrategy;

/*******************************************************************************
 * @date 2019-01-24 上午 10:59
 * @author: <a href=mailto:>黄跃然</a>
 * @Description:
 ******************************************************************************/
public class Main {

    public static void main(String[] args) {
        MemberStrategy primaryMemberStrategy = new PrimaryMemberStrategy();
        MemberStrategy intermediateMemberStrategy = new IntermediateMemberStrategy();
        MemberStrategy seniorMemberStrategy = new SeniorMemberStrategy();

        System.out.println(new PriceManager(primaryMemberStrategy).getMemberPrice(388));
        System.out.println(new PriceManager(intermediateMemberStrategy).getMemberPrice(388));
        System.out.println(new PriceManager(seniorMemberStrategy).getMemberPrice(388));
    }

}
