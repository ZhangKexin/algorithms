/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.algorithms.collections;

public class FixedCapacityStack<Item>{
    private Item[] a;
    private int N;
    public FixedCapacityStack(int cap) {
        this.a = (Item[]) new Object[cap];
    }
    public void push(Item item) {
        if (this.isFull()) {
            this.resize(N * 2);
        }
        this.a[N++] = item;
    }

    public Item pop() {
        Item item = this.a[--N];
        a[N] = null;
        if (N > 0 && N == a.length / 4) {
            this.resize(a.length / 2);
        }
        return item;
    }

    public boolean isEmpty() {
        return this.N == 0;
    }

    public int size() {
        return this.N;
    }

    private boolean isFull() {
        return this.N == this.a.length;
    }

    private void resize(int max) {
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }
}
