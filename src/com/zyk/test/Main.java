package com.zyk.test;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String a = "a";
        String b = "b";
        String ab = "ab";
        String ab2 = a +b;
     /*   if (ab.equals(ab2)){
            System.out.println("1111");
        }
        if (ab == ab2){
            System.out.println("222222222");
        }*/
        Double aa = Double.parseDouble("2");
        Double bb = Double.parseDouble("3");
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(aa/bb));
        BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(2.4/(1000000/86400000)*15));

    }
}
