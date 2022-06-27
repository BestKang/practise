package com.zyk.test;

/**
 * 功能描述:
 *
 * @author zyk
 * @date 2021/11/19 15:56
 * @version: 1.0
 */
public class Test6 {

        public static void main(String[] args){
            Object o=new Object(){
                public boolean equals(Object obj){
                    return true;
                }
            };
            System.out.println(o.equals("Fred"));
        }

}
