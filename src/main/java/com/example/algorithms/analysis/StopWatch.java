/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.algorithms.analysis;

import java.util.Random;

public class StopWatch {
    private final long start;

    public StopWatch() {
        this.start = System.currentTimeMillis();
    }

    public double elapseTime() {
        return (System.currentTimeMillis() - start) / 1000.0;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int N = 10000;
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = random.nextInt(1000000);
        }
        StopWatch timer = new StopWatch();
        int cnt = ThreeSum.count(a);
        System.out.println(cnt + " triples in " + timer.elapseTime() + " secs");
    }
}
