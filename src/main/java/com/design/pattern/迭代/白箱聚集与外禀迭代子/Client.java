package com.design.pattern.迭代.白箱聚集与外禀迭代子;

// 聚集对象提供暴露接口，破坏封装性，称为白箱。 迭代子是在聚集对象外部，称为外禀迭代子。
// 由于迭代子在外部，所以聚集对象需要暴露自身，给迭代子调用。 -- 白箱聚集与外禀迭代子
public class Client {

    public void operation() {
        Object[] objArray = {"One", "Two", "Three", "Four", "Five", "Six"};
        //创建聚合对象
        Aggregate agg = new ConcreteAggregate(objArray);
        //循环输出聚合对象中的值
        Iterator it = agg.createIterator();
        while (!it.isDone()) {
            System.out.println(it.currentItem());
            it.next();
        }
    }

    public static void main(String[] args) {

        Client client = new Client();
        client.operation();
    }

}