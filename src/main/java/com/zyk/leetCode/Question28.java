package com.zyk.leetCode;

public class Question28 {
    public static int strStr(String haystack, String needle) {
        if (!haystack.contains(needle)){
            return -1;
        }
        /*int index=0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) != needle.charAt(i)){
                continue;
            }
        }*/
        return  haystack.indexOf(needle);

    }

    public static void main(String[] args) {
        System.out.println(strStr("leetcode", "code"));
    }
}
