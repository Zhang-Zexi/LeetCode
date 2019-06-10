package com.zzx.leetcode.removeElement;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName removeElement
 * @Description
 * @Author zhangzx
 * @Date 2019/6/10 15:46
 * Version 1.0
 **/

class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

}
public class removeElement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        Solution solution = new Solution();
        System.out.println(solution.removeElement(nums, 3));
    }
}
