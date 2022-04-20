package com.zyk.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test12 {
    public static void main(String[] args) {
        /**
         * 数组最大最小值
         */
        /*Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5};
        int min = (int) Collections.min(Arrays.asList(numbers));
        int max = (int) Collections.max(Arrays.asList(numbers));
        System.out.println("最小值: " + min);
        System.out.println("最大值: " + max);*/

        /**
         * 数组
         */
        ArrayList objArray = new ArrayList();
        ArrayList objArray2 = new ArrayList();
        objArray2.add(0,"common1");
        objArray2.add(1,"common2");
        objArray2.add(2,"notcommon");
        objArray2.add(3,"notcommon1");
        objArray.add(0,"common1");
        objArray.add(1,"common2");
        objArray.add(2,"notcommon2");
        System.out.println("array1 的元素" +objArray);
        System.out.println("array2 的元素" +objArray2);
        //差集
        objArray.removeAll(objArray2);
        //交集
        objArray.retainAll(objArray2);
        //在数组中查找指定元素
        objArray.contains("ssss");
        //判断数组是否相等
        Arrays.equals(objArray.toArray(),objArray2.toArray());
        System.out.println("array1 与 array2 数组差集为："+objArray);
    }
}
