package com.lyx.demo;

public class Main{
    public static void main(String[] args) throws CloneNotSupportedException {
        Person lyx = new Person("LYX",new Work("要饭"));
        Person lyx0 = (Person) lyx.shallowClone();
        Person lyx1 = (Person) lyx.deepClone();
        System.out.println("--------------------原对象---------------------");
        System.out.println(lyx.toString()+"\n"+lyx.getWork().toString());
        System.out.println("--------------------浅克隆对象------------------");
        System.out.println(lyx0.toString()+"\n"+lyx0.getWork().toString());
        System.out.println("--------------------深克隆对象------------------");
        System.out.println(lyx1.toString()+"\n"+lyx1.getWork().toString());
    }
}
