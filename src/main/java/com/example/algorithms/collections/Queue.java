/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.algorithms.collections;

/**
 * 队列
 */
public interface Queue<Item> extends Iterable<Item> {
    void enqueue(Item item);

    Item dequeue();

    boolean isEmpty();

    int size();
}
