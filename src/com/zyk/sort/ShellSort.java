package com.zyk.sort;

import java.util.Date;

/**
 * 功能描述:
 *
 * @author zyk
 * @date 2021/12/23 16:09
 * @version: 1.0
 */
public class ShellSort {
    public static Integer[] sort(Integer[] arr){
        int gap = arr.length/2;
        int temp ;
        for (gap = arr.length/2; gap < arr.length &&gap>0; gap=gap/2) {
            //gap =gap/2;
            for (int i = 0; i < gap; i++) {
                for (int j = i; j <arr.length-gap ; j=j+gap) {
                    if (arr[j]>arr[j+gap]){
                        temp = arr[j];
                        arr[j] = arr[j+gap];
                        arr[j+gap]=temp;
                    }else{
                        break;
                    }
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int N = 200;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 1000000);
        /*for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/
        long startTime = new Date().getTime();
        ShellSort.sort(arr);
        long endTime = new Date().getTime();
        System.out.println("耗时："+(endTime - startTime));
        System.out.println(SortTestHelper.checkIsSort(arr));
        /*for( int i = 0 ; i < arr.length ; i ++ ){
            System.out.print(arr[i]);
            System.out.print(' ');
        }*/
    }
}
