package com.lyx.demo;

public class LinkedStack {
    private Node top;

    public LinkedStack() {
        top = null;
    }

    /**
     * 入栈
     * @param data 入栈元素
     */
    public void push(int data){
        Node node = new Node(data);
        node.setNextNode(top);
        top = node;//指针上移
    }

    /**
     * 出栈
     * @return 出栈元素
     */
    public Integer pop(){
        if (top==null){
            System.out.println("栈为空！");
            return null;
        }
        int result = top.getData();
        top = top.getNextNode();//指针下移
        return result;
    }

    /**
     * 打印输出当前栈中的元素
     */
    public void printStack(){
        if (top==null){
            System.out.println("栈为空！");
            return;
        }
        Node sub = top;
        System.out.println("Top");
        while (sub!=null){
            System.out.println(sub.getData());
            sub = sub.getNextNode();
        }
        System.out.println("Bottom");

    }
}
