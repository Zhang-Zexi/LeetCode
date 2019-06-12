package com.zzx.leetcode.heightChecker;

import java.util.Arrays;

/**
 * @ClassName heightChecker
 * @Description
 * @Author zhangzx
 * @Date 2019/6/12 16:48
 * Version 1.0
 **/
class Solution {
    public int heightChecker(int[] heights) {
        int[] sortHeights = new int[heights.length];
        System.arraycopy(heights, 0, sortHeights, 0, heights.length);
        Arrays.sort(sortHeights);
        int diffCount = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sortHeights[i]) {
                diffCount++;
            }
        }
        return diffCount;
    }
}
public class heightChecker {
    public static void main(String[] args) {
        int[] nums = {1,1,4,2,1,3};
        Solution solution = new Solution();
        System.out.println(solution.heightChecker(nums));
    }
}
