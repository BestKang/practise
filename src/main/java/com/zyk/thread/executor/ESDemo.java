package com.zyk.thread.executor;

import java.util.concurrent.*;

public class ESDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<Integer> r1 = executorService.submit(new MC(1,100));
        Future<Integer> r2 = executorService.submit(new MC(1,1000));
        Future<Integer> r3 = executorService.submit(new MC(1,10000));
        System.out.println(r1.get());
        System.out.println(r2.get());
        System.out.println(r3.get());
        executorService.shutdown();
    }
}
class MC implements Callable<Integer>{
    private int begin,end;
    public MC(int begin,int end){
        this.begin=begin;
        this.end = end;

    }
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i =begin ;i <end ; i++){
            sum += i;
        }
        return sum;
    }
}
