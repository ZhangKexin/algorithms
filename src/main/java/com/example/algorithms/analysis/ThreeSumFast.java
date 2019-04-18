/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.algorithms.analysis;

import java.util.Arrays;

import com.example.algorithms.search.BinarySearch;

/**
 * 找出和为0的三元组
 *
 * 将数组排序后，使用二分查找-a[i]-a[j]
 *
 * 算法复杂度从 N^3 降至 N^2logN
 */
public class ThreeSumFast {
    public static int count(int[] a) {
        Arrays.sort(a);
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (BinarySearch.rank(-a[i] - a[j], a) > j) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
