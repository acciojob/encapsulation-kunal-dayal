package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly see = new RWOnly();
        see.setName(57);
        int p = see.getName();
        System.out.println(p);
    }
}