package com.lyx.data;

public class Main {
    public static void main(String[] args) {
        Josephu josephu = new Josephu("LYX");
        josephu.printList();
        josephu.add("CXY");
        josephu.add("CXX");
        josephu.add("XXX");
        josephu.printList();
//        josephu.josephuOut("CXY",2);
        System.out.println(josephu.josephuOut("LYX",2).toString());
        josephu.printList();
        josephu.add("NEW!");
        josephu.printList();
    }
}
