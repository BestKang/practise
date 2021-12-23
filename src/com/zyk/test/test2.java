package com.zyk.test;

/**
 * 功能描述:
 *
 * @author zyk
 * @date 2021/9/1 19:28
 * @version: 1.0
 */
public class test2 {
    static int i = 0;
    static {
        i = 20;
    }
    static {
        i = 30;
    }

    public static void main(String[] args) {
        System.out.println(i);
    }
}
