package com.lyx.demo;

public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("鼠标正在运行...");
    }

    @Override
    public void close() {
        System.out.println("鼠标已退出！");
    }

    public void click(){
        System.out.println("鼠标被点击...");
    }
}
