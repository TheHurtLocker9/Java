package com.lyx.demo;

import java.util.Arrays;

public class ArrayStackDemo {
    private int maxSize;
    private int[] stack;
    private int top;

    public ArrayStackDemo(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[maxSize];
        top = -1;
    }

    /**
     * 入栈
     * @param data 入栈元素
     */
    public void push(int data){
        if (top==maxSize-1){
            System.out.println("栈满：以5单元为增量扩容。");
            stack = Arrays.copyOf(stack,maxSize+5);
        }
        stack[++top] = data;
    }

    /**
     * 出栈
     * @return 出栈元素
     */
    public Integer pop(){
        if (top==-1){
            System.out.println("栈为空！");
            return null;
        }
        return stack[top--];
    }

    /**
     * 打印输出当前栈中的元素
     */
    public void printStack(){
        if (top==-1){
            System.out.println("栈为空！");
            return;
        }
        System.out.println("Top");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
        System.out.println("Bottom");
    }
}
