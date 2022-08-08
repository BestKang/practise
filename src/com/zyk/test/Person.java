package com.zyk.test;

/**
 * 功能描述:
 *
 * @author zyk
 * @date 2021/12/28 14:38
 * @version: 1.0
 */
public class Person{
    private String name = "Person";
    int age=0;
}
class Child extends Person{
    public String grade;
    public static void main(String[] args){
        Person p = new Child();
        System.out.println(p);
    }
}