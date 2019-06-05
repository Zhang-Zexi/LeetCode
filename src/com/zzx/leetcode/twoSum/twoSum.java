package com.zzx.leetcode.twoSum;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName twoSum
 * @Description
 * @Author zhangzx
 * @Date 2019/6/5 17:00
 * Version 1.0
 **/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i ++) {
            int result = target - nums[i];
            if (map.containsKey(result)) {
                return new int[] {map.get(result), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
public class twoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }
}

