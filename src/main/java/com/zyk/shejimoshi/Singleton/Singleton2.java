package com.zyk.shejimoshi.Singleton;

/**
 * 单例模式懒汉式写法（线程安全）
 */
public class Singleton2 {
    private static Singleton2 singleton2;
    private Singleton2(){

    }
    public static synchronized Singleton2 getInstance(){
        if (singleton2 == null){
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}
