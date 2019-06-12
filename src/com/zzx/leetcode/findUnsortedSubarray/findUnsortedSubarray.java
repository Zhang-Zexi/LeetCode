package com.zzx.leetcode.findUnsortedSubarray;

/**
 * @ClassName findUnsortedSubarray
 * @Description
 * @Author zhangzx
 * @Date 2019/6/12 17:10
 * Version 1.0
 **/
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int noMinIdx = -1;
        int min = nums[nums.length -1];
        int noMaxIdx = -1;
        int max = nums[0];
        for(int i = nums.length-2;i>-1;i--) {

            if (nums[i]>min) {
                noMinIdx = i;
            }else {
                min = nums[i];
            }

        }
        if (noMinIdx == -1) {
            return 0;
        }

        for (int i = 1; i < nums.length; i++) {

            if (nums[i]<max) {
                noMaxIdx = i;
            }else {
                max = nums[i];
            }
        }
        return noMaxIdx - noMinIdx + 1;
    }
}
public class findUnsortedSubarray {
    public static void main(String[] args) {
        int[] nums = {2,6,4,8,10,9,15};
        Solution solution = new Solution();
        System.out.println(solution.findUnsortedSubarray(nums));
    }
}
