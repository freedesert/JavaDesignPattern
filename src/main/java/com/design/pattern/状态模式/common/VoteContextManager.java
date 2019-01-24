package com.design.pattern.状态模式.common;

import com.design.pattern.状态模式.vo.User;
import com.design.pattern.状态模式.state.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*******************************************************************************
 * @date 2019-01-24 上午 9:53
 * @author: <a href=mailto:>黄跃然</a>
 * @Description:
 ******************************************************************************/
public class VoteContextManager {

    private VoteState voteState;

    /**
     * 记录投票结果
     */
    private Map<String, List<User>> voteMap = new HashMap<String, List<User>>();

    /**
     * 记录用户投票次数
     */
    private Map<User, Integer> voteCountMap = new HashMap<User, Integer>();

    public VoteState getVoteState() {
        return voteState;
    }

    public Map<String, List<User>> getVoteMap() {
        return voteMap;
    }

    public Map<User, Integer> getVoteCountMap() {
        return voteCountMap;
    }

    /**
     * 投票
     *
     * @param user     用户
     * @param voteItem 投票项
     */
    public void vote(User user, String voteItem) {
        // 改用已被禁用
        if (user.getState() == 1) {
            System.out.println("该用户已被禁用. "+user.toString());
            return;
        }

        // 首次投票,初始化
        if (!getVoteCountMap().containsKey(user)) {
            getVoteCountMap().put(user, 0);
        }
        if (!getVoteMap().containsKey(voteItem)) {
            getVoteMap().put(voteItem, new ArrayList<User>());
        }
        Integer voteCount = getVoteCountMap().get(user);

        // 正常投票
        if (voteCount == 0) {
            voteState = new NormalVoteState();
        }
        // 重复投票
        if (voteCount > 1 && voteCount < 5) {
            voteState = new RepeatVoteState();
        }
        // 恶意刷票
        if (voteCount >= 5 && voteCount < 8) {
            voteState = new SpiteVoteState();
        }
        // 禁止用户
        if (voteCount >= 8) {
            voteState = new BanVoteState();
        }

        getVoteCountMap().put(user, ++voteCount);

        voteState.handle(user, voteItem, this);
    }

}
