package com.zzx.leetcode.missingNumber;

/**
 * @ClassName missingNumber
 * @Description
 * @Author zhangzx
 * @Date 2019/6/11 15:30
 * Version 1.0
 **/
class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return nums.length * (nums.length + 1) / 2 - sum;
    }
}
public class missingNumber {
}
