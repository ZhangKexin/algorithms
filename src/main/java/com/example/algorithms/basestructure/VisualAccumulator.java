/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.algorithms.basestructure;

public class VisualAccumulator {
    private double total;
    private int N;

    public VisualAccumulator(int trials, double max) {

    }

    public void addDataValue(double val) {
        this.total += val;
        this.N++;
    }

    public double mean() {
        return total / N;
    }

}
