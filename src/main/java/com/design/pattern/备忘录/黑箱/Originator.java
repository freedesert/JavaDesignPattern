package com.design.pattern.备忘录.黑箱;

/*******************************************************************************
 * @date 2018-12-10 上午 10:26
 * @author: <a href=mailto:>黄跃然</a>
 * @Description: 发起者 创建黑箱备忘录保存自身信息。
 ******************************************************************************/
public class Originator {

    private String state; // 发起人状态

    /**
     * 创建黑箱备忘录对象 保存自身信息
     * @return
     */
    public Memento createMemento() {
        return new MementoImpl(this.state);
    }

    /**
     * 恢复到备忘录保存的状态
     * @param memento
     */
    public void restoreMemento(Memento memento){
       this.setState(((MementoImpl)memento).getState());
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private class MementoImpl implements Memento {

        private String state; // 发起人状态

        MementoImpl(String state) {
            this.state = state;
        }

        private String getState() {
            return state;
        }

        private void setState(String state) {
            this.state = state;
        }
    }
}
