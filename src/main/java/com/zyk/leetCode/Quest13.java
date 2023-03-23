package com.zyk.leetCode;

public class Quest13 {
    public static int romanToInt(String s) {
        int[] temp = new int[s.length()];
        for (int i = s.length()-1; i >=0; i--) {
            temp[i] = turn(s.charAt(i));
        }
        int res = temp[temp.length-1];
        for (int i = temp.length-1; i >0; i--) {
            if (temp[i]<=temp[i-1]){
                res = res + temp[i-1];
            }else {
                res = res - temp[i-1];
            }
        }
        return res;
    }
    public static int turn(char a){
        switch (a){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default:return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
