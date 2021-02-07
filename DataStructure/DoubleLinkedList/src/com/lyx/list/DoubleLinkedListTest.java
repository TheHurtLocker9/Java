package com.lyx.list;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleLinkedListTest {
    DoubleLinkedList list = new DoubleLinkedList();

    @Test
    void add() {
        list.add("A");
        list.add("B");
        list.add("C");
        list.showList();
    }

    @org.junit.jupiter.api.Test
    void showList() {

    }

    @Test
    void insert(){
        list.add("A");
        list.add("B");
        list.add("C");
        list.insert(0,"A-");
        list.showList();
        list.insert(4,"C+");
        list.showList();
    }

    @Test
    void delete(){
        list.add("A");
        list.add("B");
        list.add("C");
        list.showList();
        try {
            list.delete(0);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        list.delete(1);
        list.showList();
        list.delete(2);
        list.showList();
    }

    @Test
    void updata(){
        list.add("A");
        list.add("B");
        list.add("C");
        list.showList();
        try {
            list.updata(0,"a-");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        list.updata(1,"a");
        list.updata(2,"b");
        list.updata(3,"c");
//        list.updata(4,"c+");
        list.showList();
    }

    @Test
    void select(){
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list.select("A"));
        System.out.println(list.select("B"));
        System.out.println(list.select("C"));
        System.out.println(list.select("D"));
    }

    @Test
    void isExist(){
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list.isExist("A"));
        System.out.println(list.isExist("B"));
        System.out.println(list.isExist("C"));
        System.out.println(list.isExist("D"));
    }
}