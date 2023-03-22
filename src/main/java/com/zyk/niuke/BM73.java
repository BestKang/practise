package com.zyk.niuke;

import java.util.Arrays;
import java.util.Collections;

public class BM73 {

    public static boolean huiwen(String s){
        for (int i = 0; i < s.length() && i<=s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param A string字符串
     * @return int整型
     */
    public static int getLongestPalindrome(String A) {
        // write code here
//        int[] res =  new int[A.length()];
        int res =1;
        for (int i = 0; i < A.length()-1; i++) {
            for (int j = i+1; j <=A.length(); j++) {
                String sub = A.substring(i,j);
                System.out.println("当前子串："+sub+"     "+huiwen(sub));
                if (huiwen(sub)==true){
                    res= res>sub.length()?res:sub.length();
                }
            }

        }
        return res;
    }

    public static void main(String[] args) {
//        System.out.println('a'+0);
//        System.out.println('A'-0);
//        System.out.println('a'-'A');
//        System.out.println('0'-0);
//        System.out.println(huiwen("aba "));
        System.out.println(getLongestPalindrome("c"));
    }
}
