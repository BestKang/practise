package com.zyk.test;

/**
 * 功能描述:
 *
 * @author zyk
 * @date 2021/12/28 16:14
 * @version: 1.0
 */
public class Palindrome {
    public static boolean isPalindrome(String s){
        int length = s.length();
        int end = length-1;
        int begin = 0;
        while (begin<length){
            if (s.charAt(begin) != s.charAt(end)){
                return false;
            }
            begin++;
            end--;
        }
        return true;
    }
    public static int isPalindrome2(String s){
        int length = s.length();
        if (isPalindrome(s)){
            return length;
        }
        else return 1;
    }

    public static void main(String[] args) {
        //System.out.println(isPalindrome("ababa121ababa"));
        String s = "12ababa121ababachlihukguyggiugjhb";
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                //System.out.println(s.substring(i, j));
                int result = isPalindrome2(s.substring(i,j));
                if (max<result){
                    max = result;
                }
            }
        }
        System.out.println(max);
    }
}
