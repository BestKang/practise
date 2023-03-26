package com.zyk.leetCode;

import java.util.*;
public class Demo {
    public static void main(String[] args) {
        Collection<?>[] collections = // 注意， collections数组的静态类型是Collection的。
                { new HashSet<String>(),new ArrayList<String>(),new HashMap<String, String>().values()};//map.values()方法的返回值是Collection
        Super subToSuper = new Sub();//静态类型是Super，实际类型是Sub
        for(Collection<?> collection: collections) {
            System.out.println(subToSuper.getType(collection));//静态方法不存在重写，这里调用的是父类的getType方法，父类中有很多重载，根据数组的静态类型，确定调用版本
        }
    }

   
abstract static class Super {
    public static String getType(Collection<?> collection) {
        return "Super:collection";
    }
    public static String getType(List<?> list) {
        return "Super:list";
    }
    public String getType(ArrayList<?> list) {
        return "Super:arrayList";
    }
    public static String getType(Set<?> set) {
        return "Super:set";
    }
    public String getType(HashSet<?> set) {
        return "Super:hashSet";
    }
}
static class Sub extends Super {
    public static String getType(Collection<?> collection) {
        return "Sub"; }
}
}