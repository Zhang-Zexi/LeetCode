package com.zzx.leetcode.maxSubArray;

/**
 * @ClassName maxSubArray
 * @Description
 * @Author zhangzx
 * @Date 2019/6/10 17:30
 * Version 1.0
 **/
class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0)
                sum += num;
            else
                sum = num;
            res = Math.max(res, sum);
        }
        return res;
    }
}
public class maxSubArray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        Solution solution = new Solution();
        System.out.println(solution.maxSubArray(nums));
    }
}
