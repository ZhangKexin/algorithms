/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.algorithms.collections;

import java.util.Iterator;

public class ResizingArrayStack<Item> implements Stack<Item> {
    private Item[] a;
    private int N;

    @Override
    public void push(Item item) {
        if (N == a.length) {
            resize(N * 2);
        }
        a[N++] = item;
    }

    @Override
    public Item pop() {
        Item item = a[--N];
        if (N > 0 && N == a.length / 4) {
            resize(a.length / 2);
        }
        return a[--N];
    }

    @Override
    public boolean isEmpty() {
        return N == 0;
    }

    @Override
    public int size() {
        return N;
    }

    private void resize(int max) {
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item> {
        private int i = N;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            return a[--i];
        }
    }
}
