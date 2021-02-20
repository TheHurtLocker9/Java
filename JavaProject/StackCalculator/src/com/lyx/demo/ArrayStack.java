package com.lyx.demo;

import java.util.Arrays;

public class ArrayStack {
    private int maxSize;
    private int top;
    private int[] stack;

    public ArrayStack() {
        maxSize = 5;
        top = -1;
        stack = new int[maxSize];
    }

    /**
     * 入栈
     * @param data 入栈元素
     */
    public void push(int data){
        if (top==maxSize-1){
            System.out.println("栈满，扩容5个容量");
            stack = Arrays.copyOf(stack,maxSize+5);
        }
        stack[++top] = data;
    }

    /**
     * 出栈
     * @return 出栈元素 空栈则返回NULL
     */
    public Integer pop(){
        if (isEmpty()){
            System.out.println("无数据可出栈！");
            return null;
        }
        return stack[top--];
    }

    /**
     * 查看栈顶元素
     * @return 栈顶元素 空栈则返回NULL
     */
    public Integer peepTop(){
        if (isEmpty()){
            System.out.println("栈顶无数据！");
            return null;
        }
        return stack[top];
    }

    /**
     * 打印输出栈中元素
     */
    public void printStack(){
        if (isEmpty()){
            System.out.println("当前栈为空！");
            return;
        }
        System.out.println("Top");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
        System.out.println("Bottom");
    }

    /**
     * 判断当前栈是否为空
     * @return T：空 / F:非空
     */
    public boolean isEmpty(){
        return top==-1;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }
}
