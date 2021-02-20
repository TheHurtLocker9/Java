package com.lyx.demo;

public class Main {
    public static void main(String[] args) {
        ArrayStackDemo stack = new ArrayStackDemo(5);
        stack.printStack();
        stack.push(9982);
        stack.push(9923);
        stack.push(99534);
        stack.push(99123);
        stack.push(99175);
        stack.printStack();
        stack.push(99777);
        stack.printStack();
        System.out.println("出栈元素："+stack.pop());
        System.out.println("出栈元素："+stack.pop());
        stack.printStack();
    }
}
