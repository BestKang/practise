package com.zyk.leetCode;

import java.math.BigInteger;

public class Question66 {
    public static int[] plusOne(int[] digits) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < digits.length; i++) {
            sb.append(digits[i]);
        }
        String num = sb.toString();
        BigInteger integer = new BigInteger(num);
        //Integer integer = Integer.valueOf(num);
        BigInteger res = integer.add(new BigInteger("1"));
        String s = String.valueOf(res);
        int[]res2 = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            res2[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return res2;
    }

    public static void main(String[] args) {
        int[] ints = plusOne(new int[]{9,8,7,6,5,4,3,2,1,0});
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
