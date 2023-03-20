package com.zyk.jsonUtils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.Iterator;

public class JSONUtils {
    public static void compareJsons(JSONObject json1, JSONObject json2, String key){
        commonCompare(json1,json2,key);
        Iterator<String> json1Keys = json1.keySet().iterator();
        while (json1Keys.hasNext()){
            key = json1Keys.next();
            compareJsons(json1.get(key), json2.get(key),key);

        }
    }

    public static void compareJsons(Object json1,Object json2, String key){
        commonCompare(json1,json2,key);
        if (json1 instanceof JSONObject){
            //如果是JSONObject则继续递归比较。
            compareJsons((JSONObject) json1,(JSONObject) json2, key);
        } else if (json1 instanceof JSONArray){
            //如果是JSONArray，则进行数组类比较。
            compareJsons((JSONArray) json1,(JSONArray) json2,key);
        }  else {
            //其余全部为字符串比较，非字符串的也转换为字符串比较。
            compareJsons(json1.toString(),json2.toString(),key);
        }
    }

    public static void compareJsons(JSONArray jsonArray1, JSONArray jsonArray2, String key){
        commonCompare(jsonArray1,jsonArray2,key);
        //数组存在无序的情况，所以需要将1中的每一个元素，跟2中的所有元素进行比较。
        //两种方案：1.先对两个jsonArray进行排序，然后再依次比较。 2.对1中的每一个元素，判断是否在2中存在。(有重复元素的可能会有问题。)
        //方案2的实现：
        Iterator<Object> iterator1 = jsonArray1.iterator();
        while (iterator1.hasNext()){
            Object o1 = iterator1.next();
            if (jsonArray2.indexOf(o1) == -1){
                System.err.println("不一致：key  "+ key +" json1中的 jsonArray其中的value ： " + JSONObject.toJSONString(o1) + "  仅在json1中存在，不在json2中存在");
            } else {
                System.out.println("一致：key " + key +" json1中的 jsonArray其中的value ："  + JSONObject.toJSONString(o1));
            }
        }
        Iterator<Object> iterator2 = jsonArray2.iterator();
        while (iterator2.hasNext()){
            Object o2 = iterator2.next();
            if (jsonArray1.indexOf(o2) == -1){
                System.err.println("不一致：key " + key +" json2中的 jsonArray其中的value ： " + JSONObject.toJSONString(o2) + "  仅在json2中存在，不在json1中存在");
            }
        }
    }

    public static void compareJsons(String json1,String json2,String key){
        commonCompare(json1,json2,key);
        if (json1.equals(json2)){
            System.out.println("一致：key " + key + " ， json1 value = " + json1 + " json2 value = " + json2);
        } else {
            System.err.println("不一致： key " + key + " ， json1 value = " + json1 + " json2 value = " + json2 );
        }

    }

    public static void commonCompare(Object json1,Object json2,String key){
        if (json1 == null && json2 == null){
            System.err.println("不一致： key " + key + " 在两者中均不存在");
        }
        if (json1 == null){
            System.err.println("不一致： key " + key + " 在json1中不存在，在json2中为 " + JSONObject.toJSONString(json2) );
        }
        if (json2 == null){
            System.err.println("不一致： key " + key + " 在json1中为 " + JSONObject.toJSONString(json2) + " 在json2中不存在" );
        }
    }

    public static void main(String[] args) {
        String str1 = "{\"username\":\"tom\",\"age\":18,\"address\":[{\"province\":\"上海市\"},{\"city\":\"上海市\"},{\"city\":\"上海市政府\"},{\"disrtict\":\"静安区\"}],\"aihao\":[\"打球\",\"唱歌\",\"读书\"]}";
        String str2 = "{\"username\":\"andy\",\"age\":18,\"address\":[{\"province\":\"上海市\"},{\"city\":\"上海市\"},{\"disrtict\":\"静安区\"}],\"aihao\":[\"写作\",\"唱歌\",\"打球\"]}";
        compareJsons(JSONObject.parseObject(str1),JSONObject.parseObject(str2),null);
    }
}

