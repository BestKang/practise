package com.zyk.niuke;

/**
 * 给定一个长度为n的数组nums，请你找到峰值并返回其索引。数组可能包含多个峰值，在这种情况下，返回任何一个所在位置即可。
 * 1.峰值元素是指其值严格大于左右相邻值的元素。严格大于即不能有等于
 * 2.假设 nums[-1] = nums[n] =−∞
 * 3.对于所有有效的 i 都有 nums[i] != nums[i + 1]
 * 4.你可以使用O(logN)的时间复杂度实现此问题吗？
 *
 */
public class BM19 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param nums int整型一维数组
     * @return int整型
     */
    public static int findPeakElement(int[] nums) {
        // write code here
        if (nums.length==1){
            return 1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[0]>nums[1]){
                return 0;
            }
            if (nums.length >=2 && nums[nums.length-1]>nums[nums.length-2]){
                return nums.length-1;
            }
            if (nums[i]>nums[i+1] && nums[i]>nums[i-1]){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(findPeakElement(new int[]{2}));
    }
}
