package com.design.pattern.中介者.colleague;

import com.design.pattern.中介者.intermediary.AbstractIntermediary;

/*******************************************************************************

 * @date 2018-10-31 上午 10:22 
 * @author: <a href=mailto:huangyr>黄跃然</a>
 * @Description: 抽象同事类
 ******************************************************************************/
public abstract class AbstractHouse {

    private double price=22000; // 价格

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    /**
     * 中介者修改房子价格
     * @param price         修改的价格
     * @param intermediary  中介者
     */
    public abstract void changePrice(double price, AbstractIntermediary intermediary);
}
