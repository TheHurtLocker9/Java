package com.lyx.demo;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        /**
         * 随机数猜测
         */
        Random random = new Random();
        int randomNum = random.nextInt(2)+1;//[0,2]+1
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入猜想数字，随机数范围1-3");
        if (scanner.hasNextInt()){
            int userNum = scanner.nextInt();
            if (userNum==randomNum){
                System.out.println("猜对了");
            }else if (userNum>randomNum){
                System.out.println("猜大了");
            }else if (userNum<randomNum){
                System.out.println("猜小了");
            }
        }
    }
}
