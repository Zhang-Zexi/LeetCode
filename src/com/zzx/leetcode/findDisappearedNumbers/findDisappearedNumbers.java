package com.zzx.leetcode.findDisappearedNumbers;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName findDisappearedNumbers
 * @Description
 * @Author zhangzx
 * @Date 2019/6/11 17:20
 * Version 1.0
 **/
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                int j=nums[i]-1;
                while (nums[j]!=0){
                    int temp=nums[j];
                    nums[j]=0;
                    j=temp-1;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0) list.add(i+1);
        }
        return list;
    }
}
    public class findDisappearedNumbers {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        Solution solution = new Solution();
        System.out.println(solution.findDisappearedNumbers(nums));
    }
}
