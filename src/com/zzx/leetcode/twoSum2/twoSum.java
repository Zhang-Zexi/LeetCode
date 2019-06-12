package com.zzx.leetcode.twoSum2;

/**
 * @ClassName twoSum
 * @Description
 * @Author zhangzx
 * @Date 2019/6/12 16:12
 * Version 1.0
 **/
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int lo = 0;
        int hi = numbers.length-1;
        // lo 代表小数
        // hi 代表大数
        while(lo < hi){
            if (numbers[lo]+numbers[hi] < target){
                lo++;
            }else if (numbers[lo]+numbers[hi] > target){
                hi--;
            }else {
                result[0] = lo+1;
                result[1] = hi+1;
                break;
            }
        }
        return result;
    }

}
public class twoSum {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        Solution solution = new Solution();
        System.out.println(solution.twoSum(numbers, 9));
    }
}
