/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.algorithms.basestructure;

public class Transaction implements Comparable<Transaction> {
    private String who;
    private Date when;
    private double amount;
    public Transaction(String who, Date when, double amount) {
    }

    public Transaction(String transaction) {
    }

    public String who(){return who;}
    public Date when(){return when;}
    public double amount(){return amount;}

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compareTo(Transaction o) {
        return 0;
    }
}
