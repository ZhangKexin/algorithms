/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.algorithms.analysis;

import java.util.Arrays;

import com.example.algorithms.search.BinarySearch;

/**
 * 找出和为0的二元组
 *
 * 将数组排序后，使用二分查找-a[i]
 *
 * 算法复杂度从 N^2 降至 NlogN
 */
public class TwoSumFast {
    public static int count(int[] a) {
        Arrays.sort(a);
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (BinarySearch.rank(-a[i], a) > i) {
                cnt++;
            }
        }
        return cnt;
    }

}
