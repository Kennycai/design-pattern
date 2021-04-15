package com.learning.design.pattern.singleton;

/**
 * 懒汉式-锁机制(线程安全)
 * 缺点：效率下降
 */
public class Mgr03 {
    private static Mgr03 INSTANCE = new Mgr03();

    private Mgr03() {

    }

    public synchronized static Mgr03 getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new Mgr03();
        }
        return INSTANCE;
    }
}
