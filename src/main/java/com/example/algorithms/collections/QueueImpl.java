/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.algorithms.collections;

import java.util.Iterator;

public class QueueImpl<Item> implements Queue<Item> {
    private Node first;
    private Node last;
    private int N;

    @Override
    public void enqueue(Item item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
        N++;
    }

    @Override
    public Item dequeue() {
        if (first == null) {
            return null;
        }
        Item item = first.item;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        N--;
        return item;
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

    private class ListIterator implements Iterator<Item> {
        Node cur=first;
        @Override
        public boolean hasNext() {
            return cur!=null;
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
