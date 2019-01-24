package com.design.pattern.状态模式;

import com.design.pattern.状态模式.common.VoteContextManager;
import com.design.pattern.状态模式.vo.User;

import java.util.Random;

/*******************************************************************************
 * @date 2019-01-24 上午 10:14
 * @author: <a href=mailto:>黄跃然</a>
 * @Description: 状态模式 改变对象的内部行为
 ******************************************************************************/
public class Main {

    public static void main(String[] args) {
        User xiaoming = new User("xiaoming", 15);
        User xiaohong = new User("xiaohong", 16);
        User xiaolan = new User("xiaolan", 17);

        String[] voteItems = {"baidu", "google", "huawei"};

        VoteContextManager voteManager = new VoteContextManager();

        for (int i=0;i<10;i++) {
            voteManager.vote(xiaoming, voteItems[new Random().nextInt(3)]);
            voteManager.vote(xiaohong, voteItems[new Random().nextInt(3)]);
            voteManager.vote(xiaolan, voteItems[new Random().nextInt(3)]);
        }
    }

}
