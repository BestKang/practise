package com.zyk.test;

import java.util.Date;

public class Test15 {
    public static void main(String[] args) {
        Date date = new Date();
        String currentTime = String.format("%tT", date);
        System.out.println(currentTime);

    }
}
