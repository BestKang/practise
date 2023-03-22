package com.zyk.lianXuZiShuZuZuiDaHe;

public class Test2 {
    public static void sort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1; j++) {
                if (nums[j] < nums[j+1]){
                    swap(nums,j+1,j);
                }
            }
        }
    }
    public static void swap(int[] nums, int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void insertSort(int[] nums){

        for (int i = 0; i < nums.length-1; i++) {
            /*for (int j = nums.length-1; j >0; j--) {
                if (nums[j-1] > nums[j]){
                    swap(nums,j-1,j);
                }
            }*/
            for (int j = i+1; j >0; j--) {
                if (nums[j-1] > nums[j]){
                    swap(nums,j-1,j);
                }
            }
        }
    }

    public static void main(String[] args) {
        int []nums = new int[]{3,2,7,5,9,5,2,3,1};
        insertSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
