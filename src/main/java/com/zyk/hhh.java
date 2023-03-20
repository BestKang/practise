package com.zyk;

import javax.annotation.Resource;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class hhh {
    public static void main(String[] args) {
        String a ="123456789abcdefghijklmn";
      //  System.out.println(a.substring(0,17));
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
      //  System.out.println(loader);
     //   System.out.println(loader.getParent());
      //  System.out.println(loader.getParent().getParent());
        System.out.println(new String(a.getBytes(StandardCharsets.UTF_8)));


    }
}
