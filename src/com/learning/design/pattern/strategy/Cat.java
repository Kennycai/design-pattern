package com.learning.design.pattern.strategy;

public class Cat {
    private int a;

    public Cat(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "a=" + a +
                '}';
    }
}
