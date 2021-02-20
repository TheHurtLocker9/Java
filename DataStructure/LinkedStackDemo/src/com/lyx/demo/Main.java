package com.lyx.demo;

public class Main {
    public static void main(String[] args) {
        LinkedStack linkedStack = new LinkedStack();
        linkedStack.printStack();
        linkedStack.push(7782);
        linkedStack.push(7783);
        linkedStack.push(7784);
        linkedStack.push(7785);
        linkedStack.printStack();
        linkedStack.pop();
        linkedStack.pop();
        linkedStack.pop();
        linkedStack.printStack();
        linkedStack.pop();
        linkedStack.pop();
        linkedStack.printStack();
    }
}
