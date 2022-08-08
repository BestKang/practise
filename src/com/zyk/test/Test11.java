package com.zyk.test;

import java.math.BigDecimal;

/**
 * 功能描述:
 *
 * @author zyk
 * @date 2022/1/10 14:46
 * @version: 1.0
 */
public class Test11 {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("100.03");
        BigDecimal b = new BigDecimal("6.7195");
        BigDecimal c = a.multiply(b).multiply(new BigDecimal("4"))
                .divide(new BigDecimal("100"),2,BigDecimal.ROUND_HALF_UP);
        System.out.println(c);
        for (int i = 0; i < 10; i++) {
            System.out.printf("第%d页下载完成\n",i);
        }

    }
}
