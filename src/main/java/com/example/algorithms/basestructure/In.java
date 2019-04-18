/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.algorithms.basestructure;

public abstract class In {
    public In(String name) {
    }

    public In() {
    }

    abstract boolean isEmpty();

    abstract int readInt();

    abstract double readDouble();

    abstract void close();
}
