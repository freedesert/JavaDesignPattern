package com.design.pattern.原型;

import java.io.IOException;

public class TheGreatestSage {
    private Monkey monkey = new Monkey(); // 大圣本尊
    
    public void change() throws IOException, ClassNotFoundException{
        monkey.setHeight(50000);
        Monkey copyMonkey = (Monkey)monkey.deepClone(); // 克隆的大圣

        System.out.println("大圣本尊的身高是"+monkey.getHeight());
        System.out.println("克隆的大圣本尊的身高是"+copyMonkey.getHeight());

        System.out.println("大圣本尊的身高是"+monkey.getHeight());
        copyMonkey.setHeight(2000);
        System.out.println("克隆的大圣本尊的身高是"+copyMonkey.getHeight());

        System.out.println("大圣本尊的生日是：" + monkey.getBirthDate());
        System.out.println("克隆的大圣的生日是：" + copyMonkey.getBirthDate());
        System.out.println("大圣本尊跟克隆的大圣是否为同一个对象 " + (monkey == copyMonkey));
        System.out.println("大圣本尊持有的金箍棒 跟 克隆的大圣持有的金箍棒是否为同一个对象？ " + (monkey.getStaff() == copyMonkey.getStaff()));
    }
    
    public static void main(String[]args) throws IOException, ClassNotFoundException{
        TheGreatestSage sage = new TheGreatestSage();
        sage.change();
    }
}