package com.lyx.demo;

public class Rabbit extends Animal {
    int a = 10;
    public Rabbit(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println(name+"吃胡萝卜");
    }
}
