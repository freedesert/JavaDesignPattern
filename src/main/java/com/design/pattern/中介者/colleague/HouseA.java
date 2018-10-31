package com.design.pattern.中介者.colleague;

import com.design.pattern.中介者.intermediary.AbstractIntermediary;

/*******************************************************************************

 * @date 2018-10-31 上午 10:31 
 * @author: <a href=mailto:huangyr>黄跃然</a>
 * @Description: A型住房 A会影响B B会影响C C会影响AB
 ******************************************************************************/
public class HouseA extends AbstractHouse {
    @Override
    public void changePrice(double price, AbstractIntermediary intermediary) {
        super.setPrice(price);
        intermediary.AaffectBC();
    }
}
