package com.lyx.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入生日计算出生到现在生活的天数
 */
public class Birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请以yyyy-MM-dd的格式输入出生日期：");
        String birthday = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = new Date();
        try {
            //解析出生日期为Date类型
            birthdayDate = dateFormat.parse(birthday);
        } catch (ParseException e) {
            System.out.println("出生日期输入有误！");
        }
        //创建当前时间的Date对象
        Date nowDate = new Date();
        //计算出年龄毫秒值
        Long lifeMM = nowDate.getTime() - birthdayDate.getTime();
        //将生日Date格式化为yyyy年MM月dd日
        String birthdayStr = new SimpleDateFormat("yyyy年MM月dd日").format(birthdayDate);
        System.out.println("从"+birthdayStr+"至今共计生活了"+lifeMM/1000/60/60/24+"天");
    }
}
