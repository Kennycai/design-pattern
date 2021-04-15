package com.learning.design.pattern.singleton;

/**
 * 懒汉式-双重检查锁机制(线程安全)
 *
 * 添加volatile的原因：
 * 在java中创建一个对象并非是一个原子操作
 * 1：分配对象的内存空间
 * memory = allocate();
 * 2：初始化对象
 * ctorInstance(memory);
 * 3：设置instance指向刚分配的内存地址
 * instance = memory;
 * 上述操作可能会被重排序（在一些JIT编译器中）
 *
 * 在单线程程序下，重排序不会对最终结果产生影响，但是并发的情况下，可能会导致某些线程访问到未初始化的变量。
 *
 * 模拟一个2个线程创建单例的场景，如下表：
 * 时间	线程A	                    线程B
 * t1	A1:分配对象内存空间
 * t2	A3：设置instance指向内存空间
 * t3		                        B1：判断instance是否为空
 * t4		                        B2：由于instance不为null，线程B将访问instance引用的对象
 * t5	A2：初始化对象
 * t6	A4：访问instance引用的对象
 * 按照这样的顺序执行，线程B将会获得一个未初始化的对象，并且自始至终，线程B无需获取锁！
 */
public class Mgr05 {
    private volatile static Mgr05 INSTANCE = new Mgr05();

    private Mgr05() {

    }

    public static Mgr05 getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (Mgr05.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Mgr05();
                }
            }
        }
        return INSTANCE;
    }
}
