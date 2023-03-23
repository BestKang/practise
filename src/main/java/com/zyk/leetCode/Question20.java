package com.zyk.leetCode;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Question20 {
    public static boolean isValid(String s) {
        Stack stack = new Stack();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            String top = "";
            if (!stack.isEmpty()){
                top = String.valueOf(stack.pop());
            }
            if ((top+s.charAt(i)).equals("[]")||(top+s.charAt(i)).equals("()")||
                    (top+s.charAt(i)).equals("{}")){
                continue;
            }else {
                if (!top.equals("")){
                    stack.push(top.charAt(0));
                }
                stack.push(s.charAt(i));
            }
        }
        if (stack.size()==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        if (isValid("([[]{})])")){
            System.out.println(111);
        }
    }
}
