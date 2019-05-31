package com.zzx.leetcode.deleterepeat;

import java.util.Stack;

/**
 * @ClassName deleteRepeat
 * @Description
 * @Author zhangzx
 * @Date 2019/5/31 16:26
 * Version 1.0
 **/

class Solution {
    public String removeDuplicates(String S) {
        char[] s = S.toCharArray();
        int len = S.length();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < len; i ++) {
            if (stack.isEmpty() || s[i] != stack.peek()) {
                stack.push(s[i]);
            } else {
                stack.pop();
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Character c : stack) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}

public class deleteRepeat {
    public static void main(String[] args) {

    }
}
