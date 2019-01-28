package com.design.pattern.模板方法;

import com.design.pattern.模板方法.db.Insert;
import com.design.pattern.模板方法.db.impl.InsertDB;
import com.design.pattern.模板方法.db.impl.InsertHBase;
import com.design.pattern.模板方法.db.impl.InsertNFS;
import com.design.pattern.模板方法.vo.CalcResult;

import java.util.ArrayList;
import java.util.List;

/*******************************************************************************
 * @date 2019-01-28 上午 11:52
 * @author: <a href=mailto:>黄跃然</a>
 * @Description: 模板方法 准备一个抽象类，将部分逻辑以具体方法以及具体构造函数的形式实现，然后声明一些抽象方法来迫使子类实现剩余的逻辑。
 ******************************************************************************/
public class Main {

    public static void main(String[] args) {
        List<CalcResult> calcResults = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            calcResults.add(new CalcResult(i, "calc result is" + i));
        }

        Insert insert = null;
        for (CalcResult calcResult : calcResults) {
            switch (calcResult.getBizType()) {
                case 1:
                    insert = new InsertDB();
                    break;

                case 2:
                    insert = new InsertHBase();
                    break;

                case 3:
                    insert = new InsertNFS();
                    break;
                default:
                    break;
            }
            assert insert != null;
            insert.setCalcResult(calcResult);
            insert.execute();
        }
    }

}
