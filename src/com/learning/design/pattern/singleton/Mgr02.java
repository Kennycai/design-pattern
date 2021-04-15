package com.learning.design.pattern.singleton;

/**
 * 懒汉式(线程不安全)
 * 缺点：线程不安全
 */
public class Mgr02 {
    private static Mgr02 INSTANCE = new Mgr02();

    private Mgr02() {

    }

    public static Mgr02 getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new Mgr02();
        }
        return INSTANCE;
    }
}
