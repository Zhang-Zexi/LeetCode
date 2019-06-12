package com.zzx.leetcode;

/**
 * @ClassName findMaxConsecutiveOnes
 * @Description
 * @Author zhangzx
 * @Date 2019/6/12 11:51
 * Version 1.0
 **/
class Solution1 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int num = 0;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] == 1) {
                num ++;
            } else {
                res = num > res ? num : res;
                num = 0;
            }
        }
        return num > res ? num : res;
    }
}
public class findMaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.findMaxConsecutiveOnes(nums));
    }
}
