package com.learning.design.pattern.singleton;

/**
 * 枚举模式(线程安全)
 * 不仅可以解决线程同步，还可以防止反序列化
 */
public enum Mgr07 {
    INSTANCE;

    public static Mgr07 getINSTANCE() {

        return INSTANCE;
    }
}
