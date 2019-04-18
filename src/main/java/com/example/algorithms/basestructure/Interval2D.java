/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.algorithms.basestructure;

/**
 * 平面上的二维间隔
 */
public abstract class Interval2D {

    public Interval2D(Interval1D x, Interval1D y) {
    }

    /**
     * 面积
     *
     * @return
     */
    public abstract double area();

    /**
     * p是否在二维间隔中
     *
     * @param p
     *
     * @return
     */
    public abstract boolean contains(Point2D p);

    /**
     * 是否相交
     *
     * @param that
     *
     * @return
     */
    public abstract boolean intersect(Interval2D that);

    public abstract void draw();
}
