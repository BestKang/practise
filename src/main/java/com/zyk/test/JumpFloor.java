package com.zyk.test;

/**
 * 功能描述:
 *
 * @author zyk
 * @date 2021/12/28 15:22
 * @version: 1.0
 */
public class JumpFloor {
    public static int jumpFloor(int target) {
        if (target == 0) {
            return 0;
        }
        if (target == 1 || target == 2){
            return target;
        }
        return jumpFloor(target-1)+jumpFloor(target-2);
    }

    public static void main(String[] args) {
        System.out.println(jumpFloor(5));
    }
}
