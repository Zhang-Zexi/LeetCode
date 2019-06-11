package com.zzx.leetcode.mergeArray;

import java.util.Arrays;

/**
 * @ClassName mergeArray
 * @Description
 * @Author zhangzx
 * @Date 2019/6/11 11:12
 * Version 1.0
 **/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }
}
public class mergeArray {
    public static void main(String[] args) {

    }
}
