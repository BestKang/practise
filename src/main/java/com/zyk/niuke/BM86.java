package com.zyk.niuke;

import java.math.BigDecimal;

/**
 * 以字符串的形式读入两个数字，编写一个函数计算它们的和，以字符串形式返回。
 * 数据范围：
 * s.length,t.length≤100000，字符串仅由'0'~‘9’构成
 * 要求：时间复杂度O(n)
 */
public class BM86 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 计算两个数之和
     * @param s string字符串 表示第一个整数
     * @param t string字符串 表示第二个整数
     * @return string字符串
     */
    public static String solve (String s, String t) {
        // write code here
        BigDecimal a = new BigDecimal(0);
        BigDecimal b = new BigDecimal(0);

        if (!"".equals(s) || null == s){
            a = new BigDecimal(s);
        }
        if (!"".equals(t) || null == t){
            b = new BigDecimal(t);
        }
        return a.add(b).toString();
    }

    public static void main(String[] args) {
        System.out.println(solve("1", ""));
    }
}
