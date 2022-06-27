package com.zyk.sort;

import java.util.Date;

public class QuickSort {
    public static void sort(Integer[] arr,int low,int high){
        int start = low;
        int end = high;
        if (low>=high){
            return;
        }
        int temp = arr[low];
        while (low<high){
            while (low<high && arr[high]>temp){
                high--;
            }
            if(low<high){
                arr[low] = arr[high];
                low++;
            }
            while (low<high && arr[low]<temp){
                low++;
            }
            if(low<high){
                arr[high]= arr[low];
                high--;
            }
        }
        arr[low] = temp;
        sort(arr,start,low-1);
        sort(arr,low+1,end);

    }
    public static void main(String[] args) {

        int N = 20;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
        long startTime = new Date().getTime();
        //int temp = arr[0];
        //int mid =
                QuickSort.sort(arr,0,arr.length-1);
        //arr[mid] = temp;
        long endTime = new Date().getTime();
        System.out.println("耗时："+(endTime - startTime));
        System.out.println(SortTestHelper.checkIsSort(arr));
        for( int i = 0 ; i < arr.length ; i ++ ){
            System.out.print(arr[i]);
            System.out.print(' ');
        }
    }
}
