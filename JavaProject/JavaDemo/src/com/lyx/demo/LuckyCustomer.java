package com.lyx.demo;

import java.util.Scanner;

public class LuckyCustomer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("是否开始对会员身份进行判断？true/false");
        while (scanner.nextBoolean()) {
            System.out.println("请输入会员卡号：");
            if (scanner.hasNextInt()) {
                int id = scanner.nextInt();
                int idSum = 0;
                while (id > 0) {
                    idSum += id % 10;
                    id /= 10;
                }
                if (idSum > 20) {
                    System.out.println("恭喜，您是幸运用户！" );
                } else {
                    System.out.println("抱歉，请关注下次活动。" );
                }
            } else {
                System.out.println("输入有误，输入的会员卡号有误！");
            }
            System.out.println("是否继续对会员身份判断？true/false");
        }
        System.out.println("感谢使用。");
    }
}
