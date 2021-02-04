package com.lyx.demo;

public class Computer {

    public void powerOn(){
        System.out.println("电脑开机");
    }

    public void  powerOff(){
        System.out.println("电脑关机");
    }

    public void useDevice(USB usb){
        usb.open();
        if (usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;//向下转型
            mouse.click();
        }else if (usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard) usb;//向下转型
            keyboard.type();
        }
        usb.close();
    }
}
