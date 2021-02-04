package com.lyx.demo;

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    abstract void eat();
}
