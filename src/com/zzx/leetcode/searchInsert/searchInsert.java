package com.zzx.leetcode.searchInsert;

/**
 * @ClassName searchInsert
 * @Description
 * @Author zhangzx
 * @Date 2019/6/10 16:55
 * Version 1.0
 **/
class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}

public class searchInsert {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 0;
        Solution solution = new Solution();
        System.out.println(solution.searchInsert(nums, target));
    }
}
