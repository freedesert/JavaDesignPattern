package com.design.pattern.状态模式.state;

import com.design.pattern.状态模式.vo.User;
import com.design.pattern.状态模式.common.VoteContextManager;

/**
 * 投票状态接口 抽象状态
 */
public interface VoteState {

    public void handle(User user, String voteItem, VoteContextManager voteContextManager);

}
