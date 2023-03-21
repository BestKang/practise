package com.zyk.test;

public class Test99 {
    public static void main(String[] args) {
        System.out.println("return value of getValue(): " + getValue());
    }
    public static int getValue() {
        double a = 4;
        int i = 1;
        try {
            i = 4;
        } finally{
            i++;
            return i;
        }
    }
}

