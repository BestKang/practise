package com.zyk.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Test13 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("abc","abc");
        map.put("def", "def ");
        map.put("ght", "gjr");
        String [] aa = {"a","b","c"};
        JSONArray jsonArray = new JSONArray();
        for (int i = 0; i < aa.length; i++) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("reoverID",aa[i]);
            jsonArray.add(jsonObject);
        }
        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("reoverID",aa[0]);
        System.out.println(jsonArray.toString());
        System.out.println(JSON.parse(jsonArray.toString()));
        Map<String,Object> map1 = (Map<String,Object>)JSON.parse(jsonObject2.toString());
        //System.out.println(map1.get("reoverID"));
        String sh1 = jsonArray.toString();
        System.out.println(sh1);
        JSONArray objects = JSON.parseArray(sh1);
        System.out.println(JSON.parseArray(sh1));
        JSONObject jsonObject = new JSONObject();
        jsonObject = objects.getJSONObject(2);
        System.out.println(jsonObject.get("reoverID"));


    }
}
