package com.zyk;


public class BM95 {
    public static void main(String[] args) {
        System.out.println(candy(new int[]{1,4,2,7,9}));
    }
    public static int candy (int[] arr) {
        System.out.println(arr.length);
        // write code here
        int a[] = new int[arr.length];
        int sum = 0;
        a[0] = 1;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < arr[i+1]){
                a[i+1] = a[i]+1;
            }else{
                a[i+1] = 1;
            }
        }
        for (int i = arr.length-1; i >0; i--) {
            if (arr[i] > arr[i-1] && a[i-1]<=a[i]){
                a[i-1] = a[i]+1;
            }
        }
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
    public static int candy2 (int[] arr) {
        System.out.println(arr.length);
        // write code here
        int index = findMin(arr);
        int sum = 1;
        int now = 1;
        int temp=arr[index];
        for (int i = index-1; i >=0; i--) {
            if (arr[i]>temp){
                now++;
                sum = sum + now;
            }else
            if (arr[i]<temp){
                now = 1;
                sum = sum + now;
            }else {
                sum = sum + now;
            }
            temp = arr[i];
        }
        now = 1;
        temp=arr[index];
        for (int i = index+1; i <arr.length; i++) {
            if (arr[i]>temp){
                now++;
                sum = sum + now;
            }else
            if (arr[i]<temp){
                now = 1;
                sum = sum + now;
            }else {
                sum = sum + now;
            }
            temp = arr[i];
        }
        return sum;
    }
    public static int findMin(int[] arr){
        int index=0;
        int value =arr[0] ;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<value){
                value = arr[i];
                index = i;
            }
        }
        return index;
    }
}
