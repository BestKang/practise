package com.zyk.leetCode;

import java.util.Arrays;

public class Question8 {
    public static int myAtoi(String s) {
        int flag = 1;
        int res = 0 ;
        int flagChange = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && res ==0 && flagChange !=1){
                continue;
            } else if (s.charAt(i) == ' ' &&(res !=0 || flagChange ==1)){
                break;
            }
            if (res != 0 &&( s.charAt(i) == '-' || s.charAt(i) == '+') ){
                break;
            }
            if (flagChange == 1 && ( s.charAt(i) == '-' || s.charAt(i) == '+')){
                break;
            }
            if (s.charAt(i) == '-' && res ==0){
                flagChange = 1;
                flag = -1;
                continue;
            }
            if (s.charAt(i) == '+' && res ==0){
                flagChange = 1;
                flag = 1;
                continue;
            }
            if ((s.charAt(i) > '9' || s.charAt(i) < '0') && s.charAt(i) != '+'){
                break;
            }
            if (flag ==1 &&res >=(Integer.MAX_VALUE - Integer.valueOf(s.charAt(i)))/10){
                return Integer.MAX_VALUE;
            }
            if (flag == -1 &&res >= (Integer.MIN_VALUE -Integer.valueOf(s.charAt(i)))/10){
                return Integer.MIN_VALUE;
            }
            res = res * 10 + (s.charAt(i)-'0');
        }
        return flag == 1 ? res :res * -1;
    }

    public static int myAtoi2(String str) {
        char[] chars = str.toCharArray();
        int n = chars.length;
        int idx = 0;
        while (idx < n && chars[idx] == ' ') {
            // 去掉前导空格
            idx++;
        }
        if (idx == n) {
            //去掉前导空格以后到了末尾了
            return 0;
        }
        boolean negative = false;
        if (chars[idx] == '-') {
            //遇到负号
            negative = true;
            idx++;
        } else if (chars[idx] == '+') {
            // 遇到正号
            idx++;
        } else if (!Character.isDigit(chars[idx])) {
            // 其他符号
            return 0;
        }
        int ans = 0;
        while (idx < n && Character.isDigit(chars[idx])) {
            int digit = chars[idx] - '0';
            if (ans > (Integer.MAX_VALUE - digit) / 10) {
                // 本来应该是 ans * 10 + digit > Integer.MAX_VALUE
                // 但是 *10 和 + digit 都有可能越界，所有都移动到右边去就可以了。
                return negative? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            ans = ans * 10 + digit;
            idx++;
        }
        return negative? -ans : ans;
    }
    public static void main(String[] args) {
        System.out.println(myAtoi2("00000-42a1234"));
        System.out.println(Character.isLetter('a'));
        System.out.println(Arrays.toString(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }
}
