package com.lyx.homework;

public class Worker {
    String name;//姓名
    int age;//年龄
    double salary;//工资
    Address addr;

    public Worker() {

    }

    public Worker(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Worker(String name, int age, double salary, Address addr) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.addr = addr;
    }

    public void work(){

    }

    /**
     *
     * @param time 工作时间
     */
    public void work(int time){
        //do something
    }
}
