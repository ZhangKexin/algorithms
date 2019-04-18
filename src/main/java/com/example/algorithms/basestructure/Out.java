/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.algorithms.basestructure;

public abstract class Out {
    public Out(String name) {
    }

    public Out() {
    }

    abstract void print(String s);

    abstract void println(String s);

    abstract void println();

    abstract void printf(String... f);

    abstract void close();
}
