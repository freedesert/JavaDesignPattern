package com.design.pattern.外观;

public class ModuleFacade {

    ModuleA a = new ModuleA();
    ModuleB b = new ModuleB();
    ModuleC c = new ModuleC();

    /**
     * 下面这些是A、B、C模块对子系统外部提供的方法
     */
    public void a1() {
        a.a1();
    }

    public void b1() {
        b.b1();
    }

    public void c1() {
        c.c1();
    }

    public static void main(String[] args) {
        ModuleFacade facade = new ModuleFacade();
        facade.a1();
        facade.b1();
        facade.c1();
    }
}
