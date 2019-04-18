/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.algorithms.analysis;

/**
 * 找出和为0的三元组
 * 使用三层循环，算法复杂度 N^3
 */
public class ThreeSum {
    public static int count(int[] a) {
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        //        int[] a = In.readInts(args[0]);
        //        System.out.println(count(a));
    }
}
