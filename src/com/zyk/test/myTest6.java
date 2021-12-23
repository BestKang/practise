package com.zyk.test;

/**
 * 功能描述:
 *
 * @author zyk
 * @date 2021/11/5 15:30
 * @version: 1.0
 */
public class myTest6 {
    public static int i = 0;
    public static void main(String[] args) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(classLoader);
        new Thread(()->{
            while (true){
                i++;
                System.out.println("操作"+i);
            }
        }).start();
        while(i < 10000){
            System.out.println("第几次判断"+i);
            System.out.println("结束");
        }
    }
}
