///*
// * Copyright (C) 2019 ***, Inc. All Rights Reserved.
// */
//package com.example.algorithms.basestructure;
//
//public class Interval2DTest {
//    public static void main(String[] args) {
//        double xlo = Double.parseDouble(".2");
//        double xhi = Double.parseDouble(".5");
//        double ylo = Double.parseDouble(".5");
//        double yhi = Double.parseDouble(".6");
//        int T = Integer.parseInt("10000");
//
//        Interval1D xinterval = new Interval1D(xlo, xhi);
//        Interval1D yinterval = new Interval1D(ylo, yhi);
//
//        Interval2D box = new Interval2D(xinterval, yinterval);
//        box.draw();
//
//        Counter counter = new Counter("hits");
//        for (int t = 0; t < T; t++) {
//            double x = Math.random();
//            double y = Math.random();
//            Point2D p = new Point2D(x, y);
//            if (box.contains(p)) {
//                counter.increment();
//            } else {
//                p.draw();
//            }
//        }
//        System.out.println(counter);
//        System.out.println(box.area());
//    }
//}
