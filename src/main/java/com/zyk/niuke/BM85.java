package com.zyk.niuke;


import org.apache.commons.codec.binary.Hex;

/**
 * 编写一个函数来验证输入的字符串是否是有效的 IPv4 或 IPv6 地址
 *
 * IPv4 地址由十进制数和点来表示，每个地址包含4个十进制数，其范围为 0 - 255， 用(".")分割。比如，172.16.254.1；
 * 同时，IPv4 地址内的数不会以 0 开头。比如，地址 172.16.254.01 是不合法的。
 *
 * IPv6 地址由8组16进制的数字来表示，每组表示 16 比特。这些组数字通过 (":")分割。比如,  2001:0db8:85a3:0000:0000:8a2e:0370:7334 是一个有效的地址。而且，我们可以加入一些以 0 开头的数字，字母可以使用大写，也可以是小写。所以， 2001:db8:85a3:0:0:8A2E:0370:7334 也是一个有效的 IPv6 address地址 (即，忽略 0 开头，忽略大小写)。
 *
 * 然而，我们不能因为某个组的值为 0，而使用一个空的组，以至于出现 (::) 的情况。 比如， 2001:0db8:85a3::8A2E:0370:7334 是无效的 IPv6 地址。
 * 同时，在 IPv6 地址中，多余的 0 也是不被允许的。比如， 02001:0db8:85a3:0000:0000:8a2e:0370:7334 是无效的。
 *
 * 说明: 你可以认为给定的字符串里没有空格或者其他特殊字符。
 *
 * 数据范围：字符串长度满足5≤n≤50
 * 进阶：空间复杂度O(n)，时间复杂度 O(n)
 */
public class BM85 {
    /**
     * 验证IP地址
     * @param IP string字符串 一个IP地址字符串
     * @return string字符串
     */
    public static String solve (String IP) {
        // write code here
        String result = "Neither";
        if (checkIpv4(IP)){
            result = "IPv4";
        }
        if (checkIpv6(IP)){
            result = "IPv6";
        }
        return result;
    }

    /**
     *
     * @param IP
     * @return
     */
    public static Boolean checkIpv4(String IP){
        if(IP.endsWith("\\.")){
            return false;
        }
        String[] address = IP.split("\\.");
        if (address.length != 4){
            return false;
        }
        for (String s : address) {
            if (s.startsWith("0") && s.length()>1){
                return false;
            }
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >='a' && s.charAt(i)<'z'){
                    return false;
                }
                if (s.charAt(i) >='A' && s.charAt(i)<'Z'){
                    return false;
                }
            }
            int i = Integer.parseInt(s);
            if(i >255 || i< 0){
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param IP
     * @return
     */
    public static Boolean checkIpv6(String IP){
        String[] address = IP.split(":");
        if (address.length != 8 ){
            return false;
        }
        if(IP.endsWith(":")){
            return false;
        }
        for (String s : address) {
            char[] chars = s.toCharArray();
            if (chars.length>4){
              return false;
            }
            int sum = 0;
            for (int i = 0; i < chars.length; i++) {
                if (s.charAt(i) >='g' && s.charAt(i)<'z'){
                    return false;
                }
                if (s.charAt(i) >='G' && s.charAt(i)<'Z'){
                    return false;
                }
                sum = chars[i] + sum;
            }
            if (sum == 0 && chars.length != 1){
                return false;
            }
            if ("".equals(s)){
              return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(solve("2001:0db8:85a3:0:0:8A2E:0370:7334:"));
    }
}
