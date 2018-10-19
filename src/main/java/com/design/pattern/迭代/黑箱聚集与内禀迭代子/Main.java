package com.design.pattern.迭代.黑箱聚集与内禀迭代子;

/*******************************************************************************
 *
 * @date 2018-10-19 上午 11:08 
 * @author: <a href=mailto:huangyr@.com>黄跃然</a>
 * @Description: 黑箱聚集与内禀迭代子.  没有破坏封装性
 ******************************************************************************/
public class Main {

    public static void main(String[] args) {
        Object[] arr = {"One", "Two", "Three", "Four", "Five", "Six"};
        Aggregate aggregate = new ConcreteAggregate(arr);

        Iterator iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }

}
