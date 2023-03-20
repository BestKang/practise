package com.zyk.niuke;

import java.util.HashMap;
import java.util.Iterator;

public class BM51 {
    public static void main(String[] args) {
        System.out.println(MoreThanHalfNum_Solution(new int[]{3,3,3,3,2,2,2}));
    }
    public static int MoreThanHalfNum_Solution(int[] array) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
            if (map.get(array[i])==null){
                map.put(array[i],1);
            }else {
                map.put(array[i], map.get(array[i]) +1);
            }
        }
        int a=0,b=0;
        for (int i = 0; i < array.length; i++) {
            if (map.get(array[i])>b){
                b=map.get(array[i]);
                a=array[i];
            }
        }
        return a;
    }
}
