package com.zyk.test;

/**
 * 功能描述:
 *
 * @author zyk
 * @date 2021/9/3 18:38
 * @version: 1.0
 */
public class test4 {
    static int i =0;
    public int Fd(int a){
        //int i =0 ;
        try {
            System.out.println(a);
            a++;
            //return a/0;
            return a;
        }catch (Exception e){
            e.printStackTrace();
            return 1;
        } finally {
            a = 20;
            return 99;
        }
    }

    public static void main(String[] args) {
        int b = 3;
        test4 t4 = new test4();
        //System.out.println(t4.Fd(2));
        int a = t4.Fd(b);
        System.out.println(a);
        System.out.println(b);
    }
}
