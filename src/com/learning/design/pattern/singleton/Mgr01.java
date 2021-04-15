package com.learning.design.pattern.singleton;

/**
 * 饿汉式
 * 缺点：不管使用与否，类装载时就完成实例化
 */
public class Mgr01 {
    private final static Mgr01 INSTANCE = new Mgr01();

    private Mgr01() {

    }

    public static Mgr01 getINSTANCE() {
        return INSTANCE;
    }
}
