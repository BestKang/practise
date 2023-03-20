package com.zyk.sort;

import java.util.Date;

/**
 * 功能描述:
 *
 * @author zyk
 * @date 2021/12/23 15:03
 * @version: 1.0
 */

public class InsertionSort {
    /**
     * 插入排序
     */
    //核心代码---开始
    public static void sort(Comparable[] arr){

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            // 寻找元素 arr[i] 合适的插入位置
            for( int j = i ; j > 0 ; j -- )
                if( arr[j].compareTo( arr[j-1] ) < 0 )
                    swap( arr, j , j-1 );
                else
                    break;
        }
    }
    //核心代码---结束
    private static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {

        int N = 10;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 1000000);
        /*for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/
        long startTime = new Date().getTime();
        InsertionSort.sort(arr);
        long endTime = new Date().getTime();
        System.out.println("耗时："+(endTime - startTime));
        System.out.println(SortTestHelper.checkIsSort(arr));
        /*for( int i = 0 ; i < arr.length ; i ++ ){
            System.out.print(arr[i]);
            System.out.print(' ');
        }*/
    }

}
