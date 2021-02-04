package com.lyx.demo;

public class Person implements Cloneable{
    private String name;
    private Work work;

    public Person() {
    }

    public Person(String name, Work work) {
        this.name = name;
        this.work = work;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }

//    //重写为深克隆
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
////        return super.clone();
//        //调用父clone方法先对克隆对象本身进行克隆
//        Person person = (Person) super.clone();
//        //将克隆后的引用对象设置给克隆对象
//        person.setWork((Work) person.work.clone());
//        return person;
//    }

    //浅克隆
    public Object shallowClone() throws CloneNotSupportedException {
        return super.clone();
    }

    //深克隆
    public Object deepClone() throws CloneNotSupportedException {
        //调用父clone方法先对克隆对象本身进行克隆
        Person person = (Person) super.clone();
        //将克隆后的引用对象设置给克隆对象
        person.setWork((Work) person.work.clone());
        return person;
    }
}
