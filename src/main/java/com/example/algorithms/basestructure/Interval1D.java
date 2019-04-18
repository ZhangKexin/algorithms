/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.algorithms.basestructure;

/**
 * 直线上间隔
 */
public abstract class Interval1D {

    public Interval1D(double lo, double hi) {
    }

    /**
     * 间隔长度吗
     *
     * @return
     */
    public abstract double length();

    /**
     * x是否在间隔中
     *
     * @param x
     *
     * @return
     */
    public abstract boolean contains(double x);

    /**
     * 是否相交
     *
     * @param that
     *
     * @return
     */
    public abstract boolean intersect(Interval1D that);

    public abstract void draw();
}
