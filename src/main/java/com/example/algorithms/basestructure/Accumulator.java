/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.algorithms.basestructure;

public class Accumulator {
    private double total;
    private int N;

    public Accumulator() {
    }

    public void addDataValue(double val) {
        this.total += val;
        this.N++;
    }

    public double mean() {
        return total / N;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Accumulator{");
        sb.append("total=").append(total);
        sb.append(", N=").append(N);
        sb.append('}');
        return sb.toString();
    }
}
