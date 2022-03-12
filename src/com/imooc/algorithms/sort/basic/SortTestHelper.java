package com.imooc.algorithms.sort.basic;

import java.util.Random;

public class SortTestHelper {

    public static Integer[] generateRandomArray(int n, int leftRange, int rightRange) {
        assert leftRange <= rightRange;

        Integer[] data = new Integer[n];

        for (int i = 0; i < n; i++) {
            Integer randomNum = Math.abs(new Random().nextInt()) % (rightRange - leftRange + 1) + leftRange;
            data[i] = randomNum;
        }
        return data;
    }
}
