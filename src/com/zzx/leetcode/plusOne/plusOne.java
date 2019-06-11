package com.zzx.leetcode.plusOne;

/**
 * @ClassName plusOne
 * @Description
 * @Author zhangzx
 * @Date 2019/6/11 10:40
 * Version 1.0
 **/

class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i --) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
public class plusOne {
    public static void main(String[] args) {
        int[] digits = {9,9,9};
        Solution solution = new Solution();
        System.out.println(solution.plusOne(digits));
    }
}
