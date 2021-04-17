package com.learning.design.pattern.strategy;

import java.util.Comparator;

/**
 *
 * 使用策略模式实现的冒泡排序，将排序实现方式通过参数的形式传入，而不是固定一个方法
 * @param <T>
 */
public class Sorter<T> {
    public void sort(T[] o, Comparator<T> comparator) {
        for (int i = o.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (comparator.compare(o[j], o[j + 1]) > 0) {
                    swap(o, j, j + 1);
                }
            }
        }
    }

    private void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
