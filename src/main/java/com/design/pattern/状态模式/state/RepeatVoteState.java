package com.design.pattern.状态模式.state;

import com.design.pattern.状态模式.vo.User;
import com.design.pattern.状态模式.common.VoteContextManager;

/*******************************************************************************
 * @date 2019-01-24 上午 9:49
 * @author: <a href=mailto:>黄跃然</a>
 * @Description: 重复投票状态
 ******************************************************************************/
public class RepeatVoteState implements VoteState {

    /**
     * 重复投票,警告用户,不记录投票结果
     * @param user
     * @param voteItem
     * @param voteContextManager
     */
    @Override
    public void handle(User user, String voteItem, VoteContextManager voteContextManager) {
        System.out.println("User:"+user.getName()+" 请不要重复投票!");
    }
}
