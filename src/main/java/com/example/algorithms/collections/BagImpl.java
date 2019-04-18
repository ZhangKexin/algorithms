/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.algorithms.collections;

import java.util.Iterator;

public class BagImpl<Item> implements Bag<Item> {
    private Node first;
    private int N;

    @Override
    public void add(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
    }

    @Override
    public boolean isEmpty() {
        return N == 0;
    }

    @Override
    public int size() {
        return N;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator {
        Node cur = first;

        @Override
        public boolean hasNext() {
            return cur != null;
        }

        @Override
        public Item next() {
            Item item = cur.item;
            cur = cur.next;
            return item;
        }
    }

    private class Node {
        Item item;
        Node next;
    }
}
