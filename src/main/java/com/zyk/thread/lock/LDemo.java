package com.zyk.thread.lock;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LDemo {
    public static void main(String[] args) {
        new MT().start();
        new MT().start();
        new MT().start();
    }
}
class Data{
    //效果同使用synchronize
    static int i = 0;
    static Lock lock = new ReentrantLock();
    //原子操作
    static AtomicInteger ai = new AtomicInteger(0);

    static void operator(){
        lock.lock();
        i++;
        System.out.println(i);
        lock.unlock();
        System.out.println(ai.incrementAndGet());
    }
    //效果类似operator
    static void operator2(){
        System.out.println(ai.incrementAndGet());
    }


}
class Data2{
    static int i = 0;
    static synchronized void operator(){
        i++;
        System.out.println(i);
    }
}
class MT extends Thread{
    @Override
    public void run() {
        while (true){
            Data.operator();
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}