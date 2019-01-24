package com.design.pattern.状态模式.state;

import com.design.pattern.状态模式.vo.User;
import com.design.pattern.状态模式.common.VoteContextManager;

import java.util.List;
import java.util.Map;

/*******************************************************************************
 * @date 2019-01-24 上午 9:49
 * @author: <a href=mailto:>黄跃然</a>
 * @Description: 恶意刷票状态
 ******************************************************************************/
public class SpiteVoteState implements VoteState {

    /**
     * 恶意刷票,删除用户投票结果,警告用户
     * @param user
     * @param voteItem
     * @param voteContextManager
     */
    @Override
    public void handle(User user, String voteItem, VoteContextManager voteContextManager) {
        Map<String, List<User>> voteMap = voteContextManager.getVoteMap();
        voteMap.get(voteItem).remove(user);
        System.out.println("User:"+user.getName()+" 恶意刷票,取消用户投票资格.");
    }

}
