package com.design.pattern.中介者.intermediary;

import com.design.pattern.中介者.colleague.AbstractHouse;

/*******************************************************************************

 * @date 2018-10-31 上午 10:39 
 * @author: <a href=mailto:huangyr>黄跃然</a>
 * @Description: 房屋价格中介者
 ******************************************************************************/
public class PriceIntermediary extends AbstractIntermediary {

    public PriceIntermediary(AbstractHouse houseA, AbstractHouse houseB, AbstractHouse houseC) {
        super(houseA, houseB, houseC);
    }

    @Override
    public void AaffectBC() {
        double price = super.getHouseA().getPrice();
        super.getHouseB().setPrice(price*1.2);
        super.getHouseC().setPrice(price*1.2*1.2);
    }

    @Override
    public void BaffectAC() {
        double price = super.getHouseB().getPrice();
        super.getHouseA().setPrice(price/1.2);
        super.getHouseC().setPrice(price*1.2);
    }

    @Override
    public void CaffectAB() {
        double price = super.getHouseC().getPrice();
        super.getHouseB().setPrice(price/1.2);
        super.getHouseA().setPrice(price/1.2/1.2);
    }
}
