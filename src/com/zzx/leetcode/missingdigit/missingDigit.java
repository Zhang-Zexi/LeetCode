package com.zzx.leetcode.missingdigit;

/**
 * @ClassName missingdigit
 * @Description
 * @Author zhangzx
 * @Date 2019/5/31 14:37
 * Version 1.0
 **/
class Solution {
        public int missingNumber(int[] nums) {
        int res=0;
        for (int i=0;i<=nums.length;i++) {
            res^=i;
        }
        for (int i=0;i<nums.length;i++) {
            res^=nums[i];
        }
        return res;
    }
}

public class missingDigit {

    public static void main(String[] args) {

        int[] nums = {9,6,4,2,3,5,7,0,1};
        Solution solution = new Solution();
        int x = solution.missingNumber(nums);
        System.out.println(x);

    }
}
