package com.lyx.demo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("LYX",200);
        Number num1 = new Number("组员1",0);
        Number num2 = new Number("组员2",0);
        Number num3 = new Number("组员3",0);
        Number num4 = new Number("组员4",0);
        ArrayList<Integer> redPacker1 = manager.sendRedPacket(500,5);
        System.out.println(redPacker1.toString());
        ArrayList<Integer> redPacker2 = manager.sendRedPacket(160,3);
        num1.receiveRedPacket(redPacker2);
        num1.show();
        num2.receiveRedPacket(redPacker2);
        num2.show();
        num3.receiveRedPacket(redPacker2);
        num3.show();
        num4.receiveRedPacket(redPacker2);
        num4.show();
        manager.show();
    }
}
