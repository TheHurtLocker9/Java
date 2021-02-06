package com.lyx.queue;

import org.junit.jupiter.api.DynamicTest;

import static org.junit.jupiter.api.Assertions.*;

class CircleArrayQueueTest {

    @org.junit.jupiter.api.Test
    void add() {
        CircleArrayQueue queue = new CircleArrayQueue(5);
        queue.add("A");
        queue.add(1);
        queue.add(2);
        queue.add("B");
        //由于默认空出一个存储单元，故maxsize=5却只能存储四个数据元素
        queue.add("C");
        queue.showQueue();
    }

    @org.junit.jupiter.api.Test
    void get() {
        CircleArrayQueue queue = new CircleArrayQueue(5);
        queue.add(1);
        try {
            System.out.println(queue.get());
            System.out.println(queue.get());
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    @org.junit.jupiter.api.Test
    void isExist() {
        CircleArrayQueue queue = new CircleArrayQueue(5);
        queue.add("A");
        queue.add(1);
        queue.add(2);
        queue.add("B");
        System.out.println(queue.isExist("A"));
        System.out.println(queue.isExist("B"));
        System.out.println(queue.isExist("C"));
    }

    @org.junit.jupiter.api.Test
    void showQueue() {
    }
}