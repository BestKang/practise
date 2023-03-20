package com.zyk.niuke;
import java.util.*;
public class BM50 {
    /**
     *
     * @param numbers int整型一维数组
     * @param target int整型
     * @return int整型一维数组
     */
    public int[] twoSum (int[] numbers, int target) {
        // write code here
        if (numbers.length<2){
            return null;
        }
        if (numbers.length==2){
            return new int[]{1,2};
        }
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i]+numbers[j]==target){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return null;
    }
    /**
     *
     * @param numbers int整型一维数组
     * @param target int整型
     * @return int整型一维数组
     */
    public int[] twoSum2 (int[] numbers, int target) {
        // write code here
        if (numbers.length<2){
            return null;
        }
        if (numbers.length==2){
            return new int[]{1,2};
        }
        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i]-target>10){
                continue;
            }
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i]+numbers[j]==target){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {

    }
}