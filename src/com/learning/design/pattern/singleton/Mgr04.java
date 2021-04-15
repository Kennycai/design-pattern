package com.learning.design.pattern.singleton;

/**
 * 懒汉式-检查锁机制(线程不安全)
 * 缺点：线程不安全
 */
public class Mgr04 {
    private static Mgr04 INSTANCE = new Mgr04();

    private Mgr04() {

    }

    public static Mgr04 getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (Mgr04.class) {
                INSTANCE = new Mgr04();
            }
        }
        return INSTANCE;
    }
}
