package com.lyx.demo;

import java.util.Scanner;

/**
 * 统计输入的字符串中不同类型字符的个数
 * （大写字母、小写字母、数字、其他字符）
 */
public class Statistic {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner scanner = new Scanner(System.in);
        String strIn = scanner.next();
        statistic(strIn);
    }

    public static void statistic(String s) {
        int capital = 0;//大写字母
        int lowercase = 0;//小写字母
        int num = 0;//数字
        int other = 0;//其他字符
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ('a' <= c && c <= 'z') {
                lowercase++;
            } else if ('A' <= c && c <= 'Z') {
                capital++;
            } else if ('0' <= c && c <= '9') {
                num++;
            } else {
                other++;
            }
        }
        System.out.println("在输入的字符串中有大写字母" + capital + "个，小写字母" + lowercase + "个，数字" + num + "个，其他字符" + other + "个。");
    }
}
