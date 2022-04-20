package com.zyk.sort;

/**
 * 功能描述:
 *
 * @author zyk
 * @date 2021/12/23 15:32
 * @version: 1.0
 */
public class SortTestHelper {

    public static Integer[] generateRandomArray(int count,int begin,int end){
        Integer[] arr = new Integer[count];
        for (int i = 0; i < count; i++) {
            int num = (int)(Math.random()*(end-begin));
            arr[i] = num;
        }
        return arr;
    }

    public static String checkIsSort(Integer[] arr){
        if (arr.length==0){
            return "数组大小为0";
        }
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1]){
                return "不是从小到大排序";
            }
        }
        return "从小到大排序成功";
    }
}
