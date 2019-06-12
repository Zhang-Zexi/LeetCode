package com.zzx.leetcode.commonChars;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName commonChars
 * @Description
 * @Author zhangzx
 * @Date 2019/6/12 15:17
 * Version 1.0
 **/
class Solution {
    public List<String> commonChars(String[] A) {
        if (A == null || A.length < 1) {
            return null;
        }
        List<String> ans = new ArrayList<>();
        int mapLetter[][] = new int[A.length][26];
        for (int i = 0;i < A.length;i++) {
            map(A[i],mapLetter[i]);
        }
        for (int i = 0;i < 26;i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0;j < A.length;j++) {
                if (min > mapLetter[j][i]) {
                    min = mapLetter[j][i];
                }
            }
            while (min-- > 0) {
                ans.add(String.valueOf((char) (i + 'a')));
            }
        }
        return ans;
    }
    private void map(String s,int a[]) {
        for (int i = 0;i < s.length();i++) {
            a[s.charAt(i) - 'a']++;
        }
    }
}
public class commonChars {
    public static void main(String[] args) {
        String[] nums = {"bella","label","roller"};
        Solution solution = new Solution();
        System.out.println(solution.commonChars(nums));
    }
}
