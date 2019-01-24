package com.design.pattern.状态模式.state;

import com.design.pattern.状态模式.vo.User;
import com.design.pattern.状态模式.common.VoteContextManager;

/*******************************************************************************
 * @date 2019-01-24 上午 9:49
 * @author: <a href=mailto:>黄跃然</a>
 * @Description: 黑名单 禁止投票状态
 ******************************************************************************/
public class BanVoteState implements VoteState {

    /**
     * 将用户移入黑名单,禁用用户.
     *
     * @param user
     * @param voteItem
     * @param voteContextManager
     */
    @Override
    public void handle(User user, String voteItem, VoteContextManager voteContextManager) {
        user.setState(1);
        System.out.println("User:"+user.getName()+" 已移入黑名单.");
    }

}
