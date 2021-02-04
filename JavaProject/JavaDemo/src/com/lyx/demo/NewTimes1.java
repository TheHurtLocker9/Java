package com.lyx.demo;

public class NewTimes1 {
    private static int times;
    /**
     *统计一个类的初始化次数
     */

    public NewTimes1() {
        times++;
    }

    public static void printTimes(){
        System.out.println(times);
    }

    public static void main(String[] args) {
        NewTimes1.printTimes();
        new NewTimes1();
        new NewTimes1();
        NewTimes1.printTimes();
    }
}
