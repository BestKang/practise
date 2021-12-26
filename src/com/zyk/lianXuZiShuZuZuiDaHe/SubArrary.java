package com.zyk.lianXuZiShuZuZuiDaHe;

/**
 * 输入一个长度为n的整型数组array，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 * 数据范围:
 * 1 <= n <= 10^51<=n<=10
 * 5
 *
 * -100 <= a[i] <= 100−100<=a[i]<=100
 *
 * 要求:时间复杂度为 O(n)O(n)，空间复杂度为 O(n)O(n)
 * 进阶:时间复杂度为 O(n)O(n)，空间复杂度为 O(1)O(1)
 *
 * 解：
 * F（i）：以array[i]为末尾元素的子数组的和的最大值，子数组的元素的相对位置不变
 *
 * F（i）=max（F（i-1）+array[i] ， array[i]）
 *
 * res：所有子数组的和的最大值
 *
 * res=max（res，F（i））
 */
public class SubArrary {
    public int FindGreatestSumOfSubArray(int[] array) {
        int addResult = array[0];//记录当前所有子数组的和的最大值
        int max = array[0];//包含array[i]的连续数组最大值
        for (int i = 1; i < array.length; i++) {
            //i为包含array[i]的连续数组最大值的下标末尾
            max = Math.max(array[i],max+array[i]);
            addResult = Math.max(addResult,max);
        }
        return addResult;
    }
}
