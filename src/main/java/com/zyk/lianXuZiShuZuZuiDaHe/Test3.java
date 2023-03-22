package com.zyk.lianXuZiShuZuZuiDaHe;

public class Test3 {
    public static void revolve(int[] nums,int k){
       if (k == 0 ){
           return;
       }
       int move = k% nums.length;
       int[] temp = new int[move];
       for (int i = 0; i < move; i++) {
           temp[i] = nums[nums.length-1-i];
       }
        for (int i = 0; i < nums.length-move; i++) {
            nums[nums.length-1-i] = nums[nums.length-1-i-move];
        }
        for (int i = 0; i < move; i++) {
            nums[i] = temp[i];
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        revolve(new int[]{1,2,3,4,5,6,7},11);
    }
}
