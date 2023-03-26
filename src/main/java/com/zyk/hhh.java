package com.zyk;

import javax.annotation.Resource;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.reverse;

public class hhh {
    public static void main(String[] args) {
        String a ="123456789abcdefghijklmn";
      //  System.out.println(a.substring(0,17));
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
      //  System.out.println(loader);
     //   System.out.println(loader.getParent());
      //  System.out.println(loader.getParent().getParent());
        System.out.println(new String(a.getBytes(StandardCharsets.UTF_8)));
        int[] ints = {1, 4, 6, 2, 3, 9, 10};
        reverse(Arrays.asList(ints));
//        Collections.min(Arrays.asList(ints));
        Collections.reverse(Arrays.asList(a.toCharArray()));
        System.out.println(Math.ceil(9.5));
        System.out.println(Math.floor(9.5));

        int[] bbb = new int[]{11,0,5,8,7,23};

    }


}
