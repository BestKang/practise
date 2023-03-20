package com.zyk.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 功能描述:
 *
 * @author zyk
 * @date 2021/11/8 11:02
 * @version: 1.0
 */
public class MyReflect {
    int a =0;
    int b = 1;

    MyReflect (){};
    MyReflect(String a,String b){
        System.out.println(a+b);
    }

    @Override
    public String toString() {
        return "MyReflect{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        MyReflect myReflect = new MyReflect();
        Class clz = myReflect.getClass();
        Constructor[] constructor = clz.getDeclaredConstructors();
        for (int i = 0; i < constructor.length; i++) {
            System.out.println(constructor[i]);
        }
        Object o = constructor[0].newInstance();
        System.out.println(o.toString());
    }
}
