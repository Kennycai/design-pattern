package com.learning.design.pattern.strategy;

import java.util.Arrays;

public class Main {
    // comparator comparable
    // 对修改关闭 对扩展开放
    public static void main(String[] args) {
        Cat[] catArr = {new Cat(1), new Cat(3), new Cat(2)};
        Sorter<Cat> sorter = new Sorter<>();
        sorter.sort(catArr, (a, b) -> {
           if (a.getA() > b.getA()) return 1;
           else if (a.getA() < b.getA()) return -1;
           else return 0;
        });
        System.out.println(Arrays.toString(catArr));
    }
}
