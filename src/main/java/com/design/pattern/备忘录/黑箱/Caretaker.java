package com.design.pattern.备忘录.黑箱;

/*******************************************************************************
 * @date 2018-12-10 上午 10:26
 * @author: <a href=mailto:>黄跃然</a>
 * @Description: 负责人 负责管理备忘录。 黑箱模式：操作的是接口对象，无法获取其具体备忘录信息。
 ******************************************************************************/
public class Caretaker {

    private Memento memento;

    /**
     * 保存备忘录
     */
    public void saveMemento(Memento memento) {
        this.memento = memento;
    }

    /**
     * 取出备忘录
     */
    public Memento retrieveMemento() {
        return memento;
    }

}
