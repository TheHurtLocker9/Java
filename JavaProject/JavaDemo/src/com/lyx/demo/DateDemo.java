package com.lyx.demo;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        //以当前系统时间创建Date对象
        Date date1 = new Date();
        //Wed Feb 10 22:32:40 CST 2021
        System.out.println(date1);

        //以1970.1.1 00:00时+60000000毫秒创建Date对象
        Date date2 = new Date(60000000);
        //Fri Jan 02 00:40:00 CST 1970
        System.out.println(date2);

        //getTime()返回Date对象相对1970.1.1 00:00的毫秒
        System.out.println(date2.getTime());//60000000
    }
}
