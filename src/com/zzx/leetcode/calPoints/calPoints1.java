package com.zzx.leetcode.calPoints;

import java.util.Stack;

/**
 * @ClassName calPoints1
 * @Description
 * @Author zhangzx
 * @Date 2019/6/3 15:50
 * Version 1.0
 **/
class Solution1 {
    public int calPoints(String[] ops) {
        int ret = 0;
        Stack<Integer> rt = new Stack<>();

        for (int i = 0; i < ops.length; i ++) {
            String current = ops[i];
            char c = current.charAt(0);

            if (c == '+') {
                Integer first = rt.pop();
                Integer second = rt.peek();
                rt.push(first);
                ret += first + second;
                rt.push(first + second);
            } else if (c == 'D') {
                int x = 2 * rt.pop();
                ret += x;
                rt.push(x/2);
                rt.push(x);
            } else if (c == 'C') {
                ret -= rt.pop();
            } else {
                int ele = Integer.valueOf(current);
                ret += ele;
                rt.push(ele);
            }
         }
        return ret;
    }
}
public class calPoints1 {
    public static void main(String[] args) {
        String[] ops = {"5","2","C","D","+"};
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.calPoints(ops));
    }
}
