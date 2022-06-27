package com.zyk.test;

import java.util.Scanner;

/**
 * 功能描述:
 *
 * @author zyk
 * @date 2021/12/7 19:47
 * @version: 1.0
 */
public class Test7 {
    public static void main(String[] args) {
        int text = 0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int money = scanner.nextInt();
            if (money-3500>80000){
                text = (money-3500)*45/100-13505;
            }
            if (money-3500>55000&&money-3500<=80000){
                text=(money-3500)*35/100-5505;
            }
            if (money-3500>35000&&money-3500<=55000){
                text=(money-3500)*30/100-2755;
            }
            if (money-3500>9000&&money-3500<=35000){
                text=(money-3500)*25/100-1005;
            }
            if (money-3500>4500&&money-3500<=9000){
                text=(money-3500)*20/100-555;
            }
            if (money-3500>1500&&money-3500<=4500){
                text=(money-3500)*10/100-105;
            }
            if (money-3500>0&&money-3500<=1500){
                text=(money-3500)*3/100;
            }
            System.out.println("实际所得："+text);
        }
    }
}
