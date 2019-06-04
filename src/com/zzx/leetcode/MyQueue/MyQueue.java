package com.zzx.leetcode.MyQueue;

import java.util.Stack;

/**
 * @ClassName MyQueue
 * @Description
 * @Author zhangzx
 * @Date 2019/6/3 17:45
 * Version 1.0
 **/

class Queue{

    private Stack<Integer> stack;
    private int front;
    private int tail;
    private int size;

    public Queue() {
        stack = new Stack<>();
        front = 0;
        tail = 0;
        size = 0;
    }

    public void push(int x) {
        stack.push(x);
        tail ++;
        size ++;
    }

    public int pop() {
        int temp = stack.get(front);
        front ++;
        size --;
        if (front == tail) {
            Stack<Integer> newStack = new Stack<>();
            stack = newStack;
            front = 0;
            tail = 0;
            size = 0;
        }
        return temp;
    }

    public int peek() {
        return stack.get(front);
    }

    public boolean empty() {
        return size == 0;
    }
}

class MyQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();

    }
}
