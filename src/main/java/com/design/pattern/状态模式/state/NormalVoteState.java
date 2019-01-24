package com.design.pattern.状态模式.state;

import com.design.pattern.状态模式.vo.User;
import com.design.pattern.状态模式.common.VoteContextManager;

import java.util.List;
import java.util.Map;

/*******************************************************************************
 * @date 2019-01-24 上午 9:49
 * @author: <a href=mailto:>黄跃然</a>
 * @Description: 正常投票状态
 ******************************************************************************/
public class NormalVoteState implements VoteState {

    /**
     * 正常投票，记录用户投票结果
     *
     * @param user
     * @param voteItem
     * @param voteContextManager
     */
    @Override
    public void handle(User user, String voteItem, VoteContextManager voteContextManager) {
        Map<String, List<User>> voteMap = voteContextManager.getVoteMap();
        voteMap.get(voteItem).add(user);
        System.out.println("User:" + user.getName() + " 对 " + voteItem + " 投票成功");

    }
}
