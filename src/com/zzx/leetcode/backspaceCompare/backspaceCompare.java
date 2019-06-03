package com.zzx.leetcode.backspaceCompare;

import java.util.Stack;

/**
 * @ClassName backspaceCompare
 * @Description
 * @Author zhangzx
 * @Date 2019/5/31 17:54
 * Version 1.0
 **/

class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stack1 = toStack(S);
        Stack<Character> stack2 = toStack(T);
        // ==比较的是引用，equals才是比较值
        return stack1.equals(T);
    }

    private Stack<Character> toStack(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c != '#') {
                stack.push(c);
            } else {
                if (stack.size() > 0) {
                    stack.pop();
                }
            }
        }
        return stack;
    }
}

public class backspaceCompare {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean x = solution.backspaceCompare("ab#c", "ad#c");
        System.out.println(x);
    }
}
