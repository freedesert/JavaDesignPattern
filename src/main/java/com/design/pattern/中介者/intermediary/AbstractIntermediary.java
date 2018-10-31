package com.design.pattern.中介者.intermediary;

import com.design.pattern.中介者.colleague.AbstractHouse;

/*******************************************************************************

 * @date 2018-10-31 上午 10:25 
 * @author: <a href=mailto:huangyr>黄跃然</a>
 * @Description: 抽象中介者 处理房子之间的房价关系  B的房价是A的1.2倍。  C的房价是B的1.2倍。
 ******************************************************************************/
public abstract class AbstractIntermediary {

    private AbstractHouse houseA; // 中介者处理的A型房子
    private AbstractHouse houseB; // 中介者处理的A型房子
    private AbstractHouse houseC; // 中介者处理的A型房子

    public AbstractIntermediary(AbstractHouse houseA, AbstractHouse houseB, AbstractHouse houseC) {
        this.houseA = houseA;
        this.houseB = houseB;
        this.houseC = houseC;
    }

    public AbstractHouse getHouseA() {
        return houseA;
    }

    public AbstractHouse getHouseB() {
        return houseB;
    }

    public AbstractHouse getHouseC() {
        return houseC;
    }

    // 定义中介者管理房子之间的影响关系

    /**
     * A会影响B
     */
    public abstract void AaffectBC();

    /**
     * B会影响C
     */
    public abstract void BaffectAC();

    /**
     * C会影响AB
     */
    public abstract void CaffectAB();

}
