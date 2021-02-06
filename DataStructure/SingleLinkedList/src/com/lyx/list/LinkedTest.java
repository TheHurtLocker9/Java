package com.lyx.list;

import static org.junit.jupiter.api.Assertions.*;

class LinkedTest {

    @org.junit.jupiter.api.Test
    void reverse() {
        //初始化单链表
        Linked linked = new Linked();
        //插入四个数据
        linked.add(new Node("张三"));
        linked.add(new Node("李四"));
        linked.add(new Node("王五"));
        linked.add(new Node("赵六"));
        linked.showList();
        //倒置链表
        linked.reverse();
        linked.showList();
    }
}