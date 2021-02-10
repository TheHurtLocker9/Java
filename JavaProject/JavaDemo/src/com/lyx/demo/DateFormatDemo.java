package com.lyx.demo;

import java.text.*;
import java.util.Date;

public class DateFormatDemo {
    public static void main(String[] args) throws ParseException {
//        格式化：日期->文本
        //创建SimpleDateFormat日期格式化对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        //以当前日期创建日期对象
        Date date = new Date();
        //使用格式化对象格式化日期对象返回字符串后打印输出
        System.out.println(simpleDateFormat.format(date));

//        解析：文本->日期
        //创建SimpleDateFormat日期格式化对象
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy年MM月dd日");
        //字符串的格式必须与格式化对象格式一致，否则会报ParseException解析异常
        String dateStr = "1998年09月16日";
        //使用格式化对象解析字符串返回Date日期对象后打印输出
        System.out.println(simpleDateFormat.parse(dateStr));
    }
}
