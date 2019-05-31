package com.zzx.leetcode.deletekh;

import java.util.Stack;

/**
 * @ClassName deleteKh
 * @Description
 * @Author zhangzx
 * @Date 2019/5/31 17:32
 * Version 1.0
 **/
    class Solution {
        public String removeOuterParentheses(String S) {
            StringBuilder stringBuilder = new StringBuilder();
            Stack<Character> stack = new Stack<>();

            int start = 0;
            int end = 0;
            boolean flag = false;

            for (int i = 0; i < S.length(); i ++) {
                char ch = S.charAt(i);

                if (ch == '(') {
                    stack.push(ch);
                    if(!flag) {
                        start = i;
                        flag = true;
                    }
                }

                if (ch == ')') {
                    stack.pop();
                    if (stack.isEmpty()) {
                        end = i;
                        stringBuilder.append(S.substring(start + 1, end));
                        flag = false;
                        start = end;
                    }
                }
            }
            return stringBuilder.toString();
        }
    }

public class deleteKh {
    public static void main(String[] args) {

    }
}
