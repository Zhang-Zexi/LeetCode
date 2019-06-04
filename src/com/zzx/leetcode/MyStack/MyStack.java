package com.zzx.leetcode.MyStack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName MyStack
 * @Description
 * @Author zhangzx
 * @Date 2019/6/4 11:19
 * Version 1.0
 **/

class MyStack1 {
    private Queue<Integer> a;//输入队列
    private Queue<Integer> b;//输出队列

    public MyStack1() {
        a = new LinkedList<>();
        b = new LinkedList<>();
    }

    public void push(int x) {
        a.offer(x);
        // 将b队列中元素全部转给a队列
        while(!b.isEmpty())
            a.offer(b.poll());
        // 交换a和b,使得a队列没有在push()的时候始终为空队列
        Queue temp = a;
        a = b;
        b = temp;
    }

    public int pop() {
        return b.poll();
    }

    public int top() {
        return b.peek();
    }

    public boolean empty() {
        return b.isEmpty();
    }
}

public class MyStack {
}
