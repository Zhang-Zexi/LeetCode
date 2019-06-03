package com.zzx.leetcode.nextGreaterElement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

/**
 * @ClassName nextGreaterElement
 * @Description
 * @Author zhangzx
 * @Date 2019/6/3 17:20
 * Version 1.0
 **/
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<Integer>();
        HashMap<Integer, Integer> hasMap = new HashMap<Integer, Integer>();

        int[] result = new int[nums1.length];

        for(int num : nums2) {
            while(!stack.isEmpty() && stack.peek()<num){
                hasMap.put(stack.pop(), num);
            }
            stack.push(num);
        }

        for(int i = 0; i < nums1.length; i++)
            result[i] = hasMap.getOrDefault(nums1[i], -1);

        return result;
    }
}
public class nextGreaterElement {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.nextGreaterElement(nums1, nums2)));
    }
}
