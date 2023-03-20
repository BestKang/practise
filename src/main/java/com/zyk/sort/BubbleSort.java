package com.zyk.sort;

import java.util.Date;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public static Integer[] sort(Integer[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    SortTestHelper.swap(arr,j,j+1);
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int N = 10;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100);
        /*for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/
        long startTime = new Date().getTime();
        BubbleSort.sort(arr);
        long endTime = new Date().getTime();
        System.out.println("耗时："+(endTime - startTime));
        System.out.println(SortTestHelper.checkIsSort(arr));
        /*for( int i = 0 ; i < arr.length ; i ++ ){
            System.out.print(arr[i]);
            System.out.print(' ');
        }*/
    }
}
