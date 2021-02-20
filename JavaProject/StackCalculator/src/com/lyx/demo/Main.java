package com.lyx.demo;

public class Main {
    public static void main(String[] args) {
        StackCalculator calculator = new StackCalculator("1+99999*9999-50000");
        System.out.println("运算结果为："+calculator.getResult());
        calculator.printComputeStack();
    }
}
