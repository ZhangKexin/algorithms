/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.algorithms;

import com.example.algorithms.collections.Stack;
import com.example.algorithms.collections.StackImpl;

/**
 * 算术表达式求值
 */
public class Evaluate {
    public static void main(String[] args) {
        String[] exp =
                new String[] {"(", "1", "+", "(", "(", "2", "+", "3", ")", "*", "(", "4", "*", "5", ")", ")", ")"};
        Stack<String> ops = new StackImpl<>();
        Stack<Double> vals = new StackImpl<>();
        for (String c : exp) {
            if ("(".equals(c)) {
            } else if ("+".equals(c) || "-".equals(c) || "*".equals(c) || "/".equals(c) || "sqrt".equals(c)) {
                ops.push(c);
            } else if (")".equals(c)) {
                String op = ops.pop();
                double v = vals.pop();
                if ("+".equals(op)) {
                    v = v + vals.pop();
                } else if ("-".equals(op)) {
                    v = vals.pop() - v;
                } else if ("*".equals(op)) {
                    v = v * vals.pop();
                } else if ("/".equals(op)) {
                    v = vals.pop() / v;
                } else if ("sqrt".equals(op)) {
                    v = Math.sqrt(v);
                }
                vals.push(v);
            } else {
                vals.push(Double.parseDouble(c));
            }
        }
        System.out.println("vals = " + vals.pop());
    }
}
