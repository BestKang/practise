package com.zyk.sort;

import java.util.Date;

/**
 * 功能描述:  希尔排序
 *
 * @author zyk
 * @date 2021/12/23 16:09
 * @version: 1.0
 */
public class ShellSort {
    public static Integer[] sort(Integer[] arr){
        int gap = arr.length/2;
        int temp ;
        for (gap = arr.length/2; gap>0; gap=gap/2) {
            //gap =gap/2;
            for (int i = gap; i < arr.length; i++) {
                for (int j = i; j >=gap ; j=j-gap) {
                    if (arr[j]<arr[j-gap]){
                        swap(arr,j,j-gap);
                    }else{
                        break;
                    }
                }
            }
        }
        /**
         * 插入排序
         */
        /*for (int i = 0; i <arr.length ; i++) {
            for (int j = i; j >0; j--) {
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else {
                    break;
                }
            }
        }*/
        return arr;
    }
    //核心代码---结束
    private static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    public static void main(String[] args) {

        int N = 20;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
        long startTime = new Date().getTime();
        ShellSort.sort(arr);
        long endTime = new Date().getTime();
        System.out.println("耗时："+(endTime - startTime));
        System.out.println(SortTestHelper.checkIsSort(arr));
        for( int i = 0 ; i < arr.length ; i ++ ){
            System.out.print(arr[i]);
            System.out.print(' ');
        }
    }
}
