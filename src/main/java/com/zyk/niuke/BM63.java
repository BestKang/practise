package com.zyk.niuke;

public class BM63 {
    public static void main(String[] args) {
        System.out.println(jumpFloor(7));
    }
    public static int jumpFloor(int target) {
        if (target==1){
            return 1;
        }
        if (target==2){
            return 2;
        }
        return jumpFloor(target-1)+jumpFloor(target-2);

    }
//    1   2   3   4   5
//    1   2   3   5   8
}
