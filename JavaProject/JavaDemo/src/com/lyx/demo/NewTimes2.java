package com.lyx.demo;

public class NewTimes2 {
    /**
     * 统计一个类的初始化次数
     */
    private static int times;
    {
        //初始化代码块，在类实例化时被执行
        times++;
    }

    public NewTimes2() {
        //构造方法中共同的操作可抽取到构造代码块中
    }

    public static void printTimes(){
        System.out.println(times);
    }

    public static void main(String[] args) {
        NewTimes2.printTimes();
        new NewTimes2();
        new NewTimes2();
        NewTimes2.printTimes();
    }
}
