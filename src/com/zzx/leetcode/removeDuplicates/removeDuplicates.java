package com.zzx.leetcode.removeDuplicates;

/**
 * @ClassName removeDuplicates
 * @Description
 * @Author zhangzx
 * @Date 2019/6/5 17:58
 * Version 1.0
 **/
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
public class removeDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates(nums));
        System.out.println("how to earn money!!!");
        System.out.println("how to live");
        System.out.println("how to happy");
        System.out.println("how to do something that make me happy");
    }
}
