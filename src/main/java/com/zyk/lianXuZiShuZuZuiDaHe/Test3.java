package com.zyk.lianXuZiShuZuZuiDaHe;

public class Test3 {
    public static void revolve(int[] nums,int k){
        if (k%nums.length==0 ){
            return;
        }
        int sub = k% nums.length;
        int []temp = new int[sub];
        for (int i = nums.length-1; i > sub; i--) {
            temp[i] = nums[i];
        }
        for (int i = k%nums.length; i < nums.length; i = i+(k%nums.length)) {
            nums[(i+k)%nums.length] = nums[i];
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
        System.out.println("----------------------");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        revolve(new int[]{3,2,7,5,9,1},2);
    }
}
