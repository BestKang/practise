package com.zyk.test;

import java.util.Base64;

public class Test20 {
    public static void main(String[] args) {
        System.out.println(Base64.getMimeEncoder().encode("xtrs,4286".getBytes()));
        byte[] bytes = Base64.getMimeDecoder().decode("[B@a987ac");
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);

        }


    }
}
