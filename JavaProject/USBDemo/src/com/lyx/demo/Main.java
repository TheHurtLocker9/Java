package com.lyx.demo;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();
        //USB usbMouse = new Mouse();使用接口向上转型创建一个鼠标对象
        Mouse usbMouse = new Mouse();//同理
        computer.useDevice(usbMouse);
        //USB usbKeyboard = new Keyboard();使用接口向上转型创建一个键盘对象
        Keyboard usbKeyboard = new Keyboard();//同理
        computer.useDevice(usbKeyboard);
        computer.powerOff();
    }
}
