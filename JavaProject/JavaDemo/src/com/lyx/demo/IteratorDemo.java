package com.lyx.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        //创建ArrayList集合
        Collection<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        System.out.println(strings);
        //获取Iterator<>迭代器
        Iterator<String> iteratorStr = strings.iterator();
        //使用迭代器遍历输出集合
        while (iteratorStr.hasNext()){
            System.out.println(iteratorStr.next());
        }
    }
}
