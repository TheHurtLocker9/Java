package com.lyx.demo;

public class Keyboard implements USB {
    @Override
    public void open() {
        System.out.println("键盘正在运行...");
    }

    @Override
    public void close() {
        System.out.println("键盘已退出！");
    }

    public void type(){
        System.out.println("键盘正在输入信息...");
    }
}
