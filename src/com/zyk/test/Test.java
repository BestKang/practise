package com.zyk.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述:
 *
 * @author zyk
 * @date 2021/11/17 17:23
 * @version: 1.0
 */
public class Test {


    public static void main(String[] args) {
        /*byte b = (byte)129;
        System.out.println(b);*/
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(String.valueOf(i));

        }
        System.out.println(list);

        Demo.print();
    }
}
