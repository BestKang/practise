package com.zyk.test;

import sun.misc.Unsafe;

import java.io.IOException;
import java.lang.reflect.Field;

/**
 * 功能描述:
 *
 * @author zyk
 * @date 2021/8/10 9:35
 * @version: 1.0
 */
public class DemoTest {
    static int _1GB=1024*1024*1024;
    public static void main(String[] args) throws IOException {
        Unsafe unsafe = getUnsafe();
        //分配内存
        long base = unsafe.allocateMemory(_1GB);
        unsafe.setMemory(base,_1GB,(byte )0);
        System.in.read();

        //释放内存
        unsafe.freeMemory(base);
        System.in.read();
    }

    public static Unsafe getUnsafe(){
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            Unsafe unsafe = (Unsafe) field.get(null);
            return  unsafe;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

}
