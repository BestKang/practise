package com.zyk.test;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test11 {
    public static void main(String[] args) {
        List<? extends Father> list = new LinkedList<>();
        //list.add(new LeiFeng());
        List<Father> list1 = new ArrayList<>();
        gg(list1);
    }

    public static void gg(List<? extends Human> list){
        System.out.println(1);
    }
}
class Human{
}
class Father extends Human{
}
class Son extends Father{
}
class LeiFeng extends Father {
}
