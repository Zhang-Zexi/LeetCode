package com.zzx.leetcode.lastStoneWeight;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @ClassName lastStoneWeight
 * @Description
 * @Author zhangzx
 * @Date 2019/6/5 14:57
 * Version 1.0
 **/

class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = 0; i < stones.length; i ++) {
            queue.offer(stones[i]);
        }
        while (queue.size() > 1) {
            int x = queue.poll();
            int y = queue.poll();
            int diff = Math.abs(x - y );
            if (diff != 0) {
                queue.offer(diff);
            }
        }
        if (queue.isEmpty()) {
            return 0;
        }
        return queue.peek();
    }
}

public class lastStoneWeight {
    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};
        Solution solution = new Solution();
        System.out.println(solution.lastStoneWeight(stones));
    }
}
