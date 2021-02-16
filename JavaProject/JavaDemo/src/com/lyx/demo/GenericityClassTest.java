package com.lyx.demo;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class GenericityClassTest {
    public static void main(String[] args) {
        //声明泛型为String类型
        GenericityClass<String> stringGenericityClass = new GenericityClass<>();
        stringGenericityClass.setT("TEST");
        System.out.println(stringGenericityClass.getT());
        //不声明泛型 使用object类型
        GenericityClass genericityClass = new GenericityClass();
        genericityClass.setT(1);
        System.out.println(genericityClass.getT());
        genericityClass.GenericityMethod(1);
        genericityClass.GenericityMethod(1.1);
        genericityClass.GenericityMethod("A");
        genericityClass.GenericityMethod('A');
        ArrayList<String> strings = new ArrayList<>();
        strings.add("aaa");
        strings.add("bbb");
        strings.add("ccc");
        printMethod(strings);
    }

    public static void printMethod(ArrayList<?> arrayList){
        Iterator<?> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void Method1(ArrayList<? extends Object> arrayList){
        //do something...
    }

    public static void Method2(ArrayList<? super String> arrayList){
        //do something...
    }
}