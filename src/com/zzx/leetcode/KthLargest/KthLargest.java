package com.zzx.leetcode.KthLargest;

import java.util.PriorityQueue;

/**
 * @ClassName KthLargest
 * @Description
 * @Author zhangzx
 * @Date 2019/6/5 15:57
 * Version 1.0
 **/
class KthLargest1 {

    final PriorityQueue<Integer> q;
    final int k;
    public KthLargest1(int k, int[] nums) {
        this.k = k;
        q = new PriorityQueue<Integer>(k);
        for(int i: nums) {
            add(i);
        }
    }

    public int add(int val) {
        if(q.size() < k) {
            q.offer(val);

        }
        else if(q.peek() < val) {
            q.poll();
            q.offer(val);
        }
        return q.peek();
    }
}

public class KthLargest {
    public static void main(String[] args) {
    }
}
