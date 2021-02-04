package com.lyx.demo;

public class Bear extends Animal{
    public Bear(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println(name+"吃蜂蜜");
    }
}
