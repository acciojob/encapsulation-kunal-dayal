package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly see = new RWOnly();
        see.setMember(57);
        int p = see.getMember();
        System.out.println(p);
    }
}