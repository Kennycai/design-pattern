package com.learning.design.pattern.singleton;

/**
 * 静态内部类(线程安全)
 * JVM保证单例
 */
public class Mgr06 {
    private Mgr06() {

    }

    private static class Mgr06Holder {
        private final static Mgr06 INSTANCE = new Mgr06();
    }

    public static Mgr06 getINSTANCE() {

        return Mgr06Holder.INSTANCE;
    }
}
