package com.lyx.list;


import org.junit.jupiter.api.Test;

class SequentialListsTest {

    @Test
    void add() {
        SequentialLists lists = new SequentialLists();
        lists.add("A");
        lists.add("A");
        lists.add("A");
        lists.add("A");
        lists.insert(0,"B");
        lists.insert(3,"C");
        lists.insert(12,"Err");
        System.out.println(lists.toString());
        lists.delete(0);
        lists.delete(4);
        System.out.println(lists.toString());
        lists.updata(2,"updata");
        System.out.println(lists.toString());
        System.out.println(lists.isExist("Q")+"索引为："+lists.indexOf("Q"));
        System.out.println(lists.isExist("updata")+"索引为："+lists.indexOf("updata"));
        System.out.println("索引为2处的元素为："+lists.dataAt(2));
        System.out.println("索引为4处的元素为："+lists.dataAt(4));
    }

    @Test
    void insert() {
    }
}