package com.zzx.leetcode.containsDuplicate;

import java.util.HashSet;

/**
 * @ClassName containsDuplicate
 * @Description
 * @Author zhangzx
 * @Date 2019/6/11 14:51
 * Version 1.0
 **/
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
public class containsDuplicate {
    public static void main(String[] args) {

    }
}
