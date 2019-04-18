/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.algorithms.collections;

import java.util.Iterator;

public class StackImpl<Item> implements Stack<Item> {
    private Node first;
    private int N;

    @Override
    public void push(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
    }

    @Override
    public Item pop() {
        if (first == null) {
            return null;
        }
        Node oldFirst = first;
        first = first.next;
        N--;
        return oldFirst.item;
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
