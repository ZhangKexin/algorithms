/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.algorithms.basestructure;

/**
 * 平面上的点
 */
public abstract class Point2D {
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    private double x;
    private double y;

    /**
     * x坐标
     *
     * @return
     */
    public double x() {
        return x;
    }

    /**
     * y坐标
     *
     * @return
     */
    public double y() {
        return y;
    }

    /**
     * 极径
     *
     * @return
     */
    public abstract double r();

    /**
     * 极角
     *
     * @return
     */
    public abstract double theta();

    /**
     * 欧几里得距离
     *
     * @param that
     *
     * @return
     */
    public abstract double distTo(Point2D that);

    public abstract void draw();
}
