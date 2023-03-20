package com.zyk.niuke;

import java.nio.charset.StandardCharsets;

public class BM83 {
    public static void main(String[] args) {
        System.out.println(trans("ab c ", 5));
    }
    public static String trans(String s, int n) {
        char[] chars = s.toCharArray();
        StringBuffer result= new StringBuffer();
        String temp="";
        for (int i = 0; i < n; i++) {
            if (chars[i]==' '){
                temp = " ";
                result = new StringBuffer(temp).append(result);
                temp="";
            }else{
                if (chars[i]>='a'&&chars[i]<='z'){
                    chars[i] = Character.toUpperCase(chars[i]);
                    temp = String.valueOf(chars[i]);
                    result = result.append(temp);
                }else {
                    temp = String.valueOf(chars[i]);
                    chars[i] = Character.toLowerCase(chars[i]);
                    result = result.append(temp);                }
            }
        }
        //result = new StringBuffer(temp).append(result);
        byte []bytes = result.toString().getBytes(StandardCharsets.UTF_8);
        //String s = new String(bytes);

        return result.toString();
    }

}
