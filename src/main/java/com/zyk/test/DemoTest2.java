package com.zyk.test;

import sun.misc.Unsafe;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述:
 *
 * @author zyk
 * @date 2021/8/10 9:35
 * @version: 1.0
 */
public class DemoTest2 {
    static int _100MB=1024*1024*100;
    public static void main(String[] args) throws IOException {
        List<ByteBuffer> list = new ArrayList<>();
        int i=0;
        try {
            while (true) {
                ByteBuffer byteBuffer = ByteBuffer.allocateDirect(_100MB);
                list.add(byteBuffer);
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println(i);
        }
    }
}
