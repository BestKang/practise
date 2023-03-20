package com.zyk.test;

import java.util.Base64;
import java.util.HashMap;

/**
 * 功能描述:
 *
 * @author zyk
 * @date 2021/12/21 10:22
 * @version: 1.0
 */
public class Test9 {
    public static void main(String[] args) {
        byte a = 127;
//        byte b = 128;
//        a= a/2;   直接爆红，错误    类型转换
//        a= (byte) (a/2);  正确
        HashMap hashMap = new HashMap();
        hashMap.put(null,"ddd");
        System.out.println(hashMap);
        System.out.println(a);
        System.out.println(Base64.getDecoder().decode("1234"));
    }
}
