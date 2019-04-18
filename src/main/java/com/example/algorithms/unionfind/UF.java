/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.algorithms.unionfind;

public interface UF {
    public void union(int p, int q);
    public int find(int p);
    public boolean connected(int p, int q);
    public int count();
}
