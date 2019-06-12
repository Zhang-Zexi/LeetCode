package com.zzx.leetcode.arrayPairSum;

import java.util.Arrays;

/**
 * @ClassName arrayPairSum
 * @Description
 * @Author zhangzx
 * @Date 2019/6/12 16:24
 * Version 1.0
 **/
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        for (int i = 1; i < nums.length; i += 2) {
            max += Math.min(nums[i-1],nums[i]);
        }
        return max;
    }
}
public class arrayPairSum {
    public static void main(String[] args) {
        int[] nums = {1,4,3,2};
        Solution solution = new Solution();
        System.out.println(solution.arrayPairSum(nums));
    }
}
