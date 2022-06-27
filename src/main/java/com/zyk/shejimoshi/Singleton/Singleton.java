package com.zyk.shejimoshi.Singleton;

/**
 * 单例模式 基本写法 线程不安全
 */
public class Singleton {
    private static Singleton singleton;
    private Singleton(){

    }
    public static Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
