package com.zyk.test;

/**
 * 功能描述:
 *
 * @author zyk
 * @date 2021/9/1 18:52
 * @version: 1.0
 */
public class test1 {
    public static void main(String[] args) {
        int i=0;
        int j =0;
        while (i < 10) {
            j = j++;
           //先加载的局部变量表，在取到操作数栈，在局部变量表完成自增，再取操作数栈的值赋值局部变量表
            i++;
        }
        System.out.println(j);
    }
}
