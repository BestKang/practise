package com.zyk.niuke;

public class BM62 {
    public static void main(String[] args) {
        System.out.println(Fibonacci(9));
    }
    public static int Fibonacci(int n) {
        if (n==1||n==2){
            return 1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}
