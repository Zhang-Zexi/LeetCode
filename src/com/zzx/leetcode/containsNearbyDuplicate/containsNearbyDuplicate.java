package com.zzx.leetcode.containsNearbyDuplicate;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @ClassName containsNearbyDuplicate
 * @Description
 * @Author zhangzx
 * @Date 2019/6/11 15:11
 * Version 1.0
 **/
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i ++) {
            if (map.containsKey(nums[i])) {
                if (Math.abs(i - map.get(nums[i])) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
public class containsNearbyDuplicate {
}
