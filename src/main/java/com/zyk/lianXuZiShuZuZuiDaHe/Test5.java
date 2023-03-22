package com.zyk.lianXuZiShuZuZuiDaHe;


public class Test5 {
    public static String tr(String s){
        StringBuffer sb = new StringBuffer();
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!=' '){
                sb.append(s.charAt(i));
            }else {
                sb.reverse();
                sb.append(' ');
                res = res.append(sb);
                sb = new StringBuffer();
            }
        }
        res = res.append(sb.reverse());
        return res.toString();
    }

    public static String reverse(String value){
        char[] chars = value.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[chars.length-1-i] = value.charAt(i);
        }
        StringBuffer sb = new StringBuffer(value);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(tr("  The  sky is blue"));
        System.out.println(tr(" a "));
    }
}
