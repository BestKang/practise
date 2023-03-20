package com.zyk.test;

import java.nio.charset.StandardCharsets;

public class Test19 {
    public static void main(String[] args) {
        int a =  2000;
        System.out.println(Integer.toBinaryString(200));
        System.out.println(Integer.toHexString(222));
        System.out.println(Integer.toOctalString(200));
        System.out.println(3*8*8+8);
        System.out.println(Double.toHexString(222.22));
        String b ="A";
        for (byte aByte : b.getBytes(StandardCharsets.UTF_8)) {
            System.out.println(aByte);
        }
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("aaaaa");
            }
        };
        Thread t1 = new Thread(runnable);
        t1.setName("你爸爸");
        t1.run();
        System.out.println(t1.getName());
    }
}
