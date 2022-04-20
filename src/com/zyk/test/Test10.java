package com.zyk.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test10 {
    public static void main(String[] args) {
        /*List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
// 获取对应的平方数
        List<Integer> squaresList = numbers.stream().map(i -> i*i).distinct().collect(Collectors.toList());
        //squaresList.stream().forEach(System.out::println);
        //squaresList.forEach(System.out::println);
        squaresList.stream().sorted().forEach(System.out::println);*/



        /*List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        // 获取对应的平方数

        List<Integer> squaresList = numbers.stream()
                .map(i -> i * i)
                .sorted((x, y) -> y - x)
                .collect(Collectors.toList());
        squaresList.forEach(num -> {
            //num++;
            System.out.println(num);
        });*/


        List<String> strList = Arrays.asList("a", "ba", "bb", "abc", "cbb", "bba", "cab");
        Map<Integer, String> strMap = new HashMap<Integer, String>();
        //strList.forEach(System.out::println);
        /*strList.forEach(str->{strList.indexOf(str);
            System.out.println(str);
        });*/
        strMap = strList.stream()
                .collect( Collectors.toMap( str -> strList.indexOf(str), str -> str ) );

        strMap.forEach((key, value) -> {
            System.out.println(key+"::"+value);
        });
    }
}
