/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.algorithms.collections;

/**
 * 背包
 * 不支持删除元素
 */
public interface Bag<Item> extends Iterable<Item> {
    void add(Item item);

    boolean isEmpty();

    int size();

}
