package com.zyk.lianXuZiShuZuZuiDaHe;

public class Test {
    public static int resolve(int []nums){
        int res = 0;
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(nums[i],max+nums[i]);
            System.out.println("max:"+max);
            res = Math.max(res,max);
            System.out.println("res:"+res);
        }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        resolve(new int[]{1,2,3,-2,-5,2,3,5});
    }
}
