package com.lyx.demo;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A-");
        //向一个集合中添加多个同一类型的数据元素
        Collections.addAll(list,"A,","B","C","D");
        System.out.println(list);//[A-, A,, B, C, D]
        //随机打乱List集合顺序
        Collections.shuffle(list);
        System.out.println(list);//[B, C, D, A,, A-] 随机结果

        ArrayList<Integer> integers = new ArrayList<>();
        Collections.addAll(integers,2,3,1,5,4);
        System.out.println(integers);//[2, 3, 1, 5, 4]
        //将集合中的元素按照默认规则排序（升序）
        Collections.sort(integers);
        System.out.println(integers);//[1, 2, 3, 4, 5]
    }
}
