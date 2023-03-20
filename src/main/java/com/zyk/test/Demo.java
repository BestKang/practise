package com.zyk.test;

/**
 * 功能描述:
 *
 * @author zyk
 * @date 2021/11/19 15:34
 * @version: 1.0
 */
public interface Demo{
    int a = 0;
    //默认方法
    public default void method(){
        System.out.println("default method...");
    }

    //静态方法
    public static void print(){
        System.out.println("static method...");
    }
    //1.8不允许，1.9可以
    /*private void method() {
        System.out.println("Hello World!");
    }*/
}