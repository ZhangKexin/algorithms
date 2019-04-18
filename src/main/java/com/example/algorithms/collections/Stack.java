/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.algorithms.collections;

/**
 * 栈
 */
public interface Stack<Item> extends Iterable<Item> {
    public void push(Item item);

    public Item pop();

    public boolean isEmpty();

    public int size();

}
