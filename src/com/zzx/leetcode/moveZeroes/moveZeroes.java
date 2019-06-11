package com.zzx.leetcode.moveZeroes;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

/**
 * @ClassName moveZeroes
 * @Description
 * @Author zhangzx
 * @Date 2019/6/11 15:39
 * Version 1.0
 **/
class Solution {
    public void moveZeroes(int[] nums) {
        //i:插入位置下标 ; j:查找位置下标
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != 0){
                nums[i] = nums[j];
                i++;
            }
        } //将后面的位置补0
        for(int p = i; p < nums.length; p++){
            nums[p] = 0;
        }
    }
}
public class moveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        Solution solution = new Solution();
        solution.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
