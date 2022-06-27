package com.zyk.shejimoshi.Singleton;

/**
 * 双重校验锁
 */
public class Singleton6 {
    private volatile static Singleton6 singleton;
    private Singleton6 (){}
    public static Singleton6 getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton6();
                }
            }
        }
        return singleton;
    }
}
