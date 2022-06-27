package com.zyk.thread;

public class TestThread {
    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            //MyTestThread thread = new MyTestThread();
            Thread thread = new Thread(new MyTestThread());
            thread.start();
        }
    }
}
