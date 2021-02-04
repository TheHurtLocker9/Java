package com.lyx.demo;

class ClassA{
    int value;
}
public class ChangeRef{
    /**
     * 引用变量做参数传递时，实际传递的是地址值
     * @param args
     */
    public static void main(String args[]){
        ClassA ca = new ClassA();
        changeValue(ca);
        System.out.println(ca.value);
        changeRef(ca);//将ca = new ClassA()的地址值做参数传入
        System.out.println(ca.value);
    }
    public static void changeValue(ClassA ca){
        ca.value = 100;
    }
    public static void changeRef(ClassA ca){
        ca = new ClassA();
        ca.value = 200;
    }
}

