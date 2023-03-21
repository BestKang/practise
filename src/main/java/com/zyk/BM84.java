package com.zyk;

import javax.print.DocFlavor;

public class BM84 {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"abca", "abcd", "abca",
                "ab", "abcde"}));
//        System.out.println(longestCommonPrefix(new String[]{"aa", "ab"}));

    }

    /**
     * @param strs string字符串一维数组
     * @return string字符串
     */
    public static String longestCommonPrefix (String[] strs) {
        // write code here
        // write code here
        if(strs.length==0){
            return "";
        }
        for(int i=1;i<strs.length;i++){
            strs[i]=qianzhui(strs[i-1],strs[i]);
        }
        return strs[strs.length-1];
    }

    public static String qianzhui(String s1,String s2){
        StringBuilder builder=new StringBuilder();
        int n=Math.min(s1.length(),s2.length());
        for(int i=0;i<n;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                break;
            }
            builder.append(s1.charAt(i));
        }
        return builder.toString();
    }
}