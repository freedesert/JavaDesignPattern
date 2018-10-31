package com.design.pattern.中介者;

import com.design.pattern.中介者.colleague.AbstractHouse;
import com.design.pattern.中介者.colleague.HouseA;
import com.design.pattern.中介者.colleague.HouseB;
import com.design.pattern.中介者.colleague.HouseC;
import com.design.pattern.中介者.intermediary.AbstractIntermediary;
import com.design.pattern.中介者.intermediary.PriceIntermediary;

/*******************************************************************************

 * @date 2018-10-31 上午 10:49 
 * @author: <a href=mailto:huangyr>黄跃然</a>
 * @Description:   中介者模式
 ******************************************************************************/
public class Main {

    public static void main(String[] args) {
        AbstractHouse houseA=new HouseA();
        AbstractHouse houseB=new HouseB();
        AbstractHouse houseC=new HouseC();

        AbstractIntermediary intermediary=new PriceIntermediary(houseA,houseB,houseC);

        houseA.changePrice(25000,intermediary);
        System.out.println(houseA.getPrice());
        System.out.println(houseB.getPrice());
        System.out.println(houseC.getPrice());

        houseB.changePrice(25000,intermediary);
        System.out.println(houseA.getPrice());
        System.out.println(houseB.getPrice());
        System.out.println(houseC.getPrice());

        houseC.changePrice(25000,intermediary);
        System.out.println(houseA.getPrice());
        System.out.println(houseB.getPrice());
        System.out.println(houseC.getPrice());
    }

}
