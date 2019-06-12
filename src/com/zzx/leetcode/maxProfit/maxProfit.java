package com.zzx.leetcode.maxProfit;

/**
 * @ClassName maxProfit
 * @Description
 * @Author zhangzx
 * @Date 2019/6/12 15:41
 * Version 1.0
 **/
class Solution {
    public int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }
}
public class maxProfit {
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(nums));
    }
}
