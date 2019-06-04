package com.zzx.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @ClassName isValidKh
 * @Description
 * @Author zhangzx
 * @Date 2019/6/4 11:27
 * Version 1.0
 **/

class Solution {
    private HashMap<Character,Character> mappinggs;

    public Solution() {
        this.mappinggs = new HashMap<Character, Character>();
        this.mappinggs.put(')', '(');
        this.mappinggs.put(']', '[');
        this.mappinggs.put('}', '{');
    }


    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i);
            if (this.mappinggs.containsKey(c)){
                char topElement = stack.isEmpty() ? '#' : stack.pop();
                if (topElement != this.mappinggs.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}


public class isValidKh {
    public static void main(String[] args) {
        String s = "{[]}";
        Solution solution = new Solution();
        System.out.println(solution.isValid(s));
    }

}
