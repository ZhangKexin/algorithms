/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.algorithms.basestructure;

public class Counter {
    private final String name;
    private int count;

    public Counter(String name) {
        this.name = name;
    }

    public void increment() {
        count++;
    }

    public int tally() {
        return count;
    }

    @Override
    public String toString() {
        return count + " " + name;
    }

}
