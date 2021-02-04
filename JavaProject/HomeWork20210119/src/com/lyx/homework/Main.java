package com.lyx.homework;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("zhangsan",25,2500,new Address("北京市海淀区清华园1 号","100084"));
        System.out.println(worker.name+worker.age+worker.salary+worker.addr.address+worker.addr.zipCode);
    }
}
