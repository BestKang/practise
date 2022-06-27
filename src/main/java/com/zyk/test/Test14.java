package com.zyk.test;

public class Test14 {
    public static void main(String[] args) {
        String filePaht = "C://DAJDS_JS.ZIP";
        String [] aa = filePaht.split("\\/");
        for (int i = 0; i < aa.length; i++) {
            System.out.println(aa[i]);
        }
        System.out.println();
    }
}
