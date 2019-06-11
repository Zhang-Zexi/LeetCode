package com.zzx.leetcode.majorityElement;

/**
 * @ClassName majorityElement
 * @Description
 * @Author zhangzx
 * @Date 2019/6/11 14:28
 * Version 1.0
 **/
class Solution {
    public int majorityElement(int[] nums) {
        int count=0;//计算当前的数字出现的次数
        int mj=0;// 当前判断的元素
        for (int i = 0; i < nums.length; i++) {
            if(count==0){//当次数为0时，则换下一判断元素
                mj=nums[i];
                count=1;
            } else if (nums[i]==mj) {
                count++;//当前元素等于判断元素，次数加一
            } else {
                count--;//不等于则次数减一
            }
        }
        return mj;
    }
}
public class majorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,2,2,2,2,2};
        Solution solution = new Solution();
        System.out.println(solution.majorityElement(nums));
    }
}
