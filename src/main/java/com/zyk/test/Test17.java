package com.zyk.test;

/**
 * 功能描述:
 *
 * @author zyk
 * @date 2021/12/27 14:46
 * @version: 1.0
 */
public class Test17 {
    public static void main(String[] args) {
        String s = "hello";
        String t = "hello";
        String r = "h"+"e"+"l"+"l"+"o";
        char c[] = {'h', 'e', 'l', 'l', 'o'} ;
        System.out.println((s.equals(c)));
        System.out.println(s==t);
        System.out.println(s==r);
        System.out.println(c);
        int a = 1;
        float b =2;
        byte d = 127;
        int e = 3;
        d = (byte) (d/e);
        System.out.println(a/b);
        System.out.println(d);
    }
}
