package com.lyx.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String computerName = null;
        String personName = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的姓名：");
        if (scanner.hasNext()) {
            personName = scanner.nextLine();
        }
        System.out.println("请输入选择您对手的姓名：");
        if (scanner.hasNext()) {
            computerName = scanner.nextLine();
        }
        if (computerName != null && personName != null) {
            Game game = new Game(computerName, personName);
            do {
                game.count++;
                game.begin();
                System.out.println("是否继续游戏（true/false）");
            } while (scanner.nextBoolean());
            game.showMessage();
        } else {
            System.out.println("您输入的用户名有误！");
        }
    }
}
