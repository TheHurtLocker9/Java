package com.lyx.demo;

import java.util.Scanner;

public class Game {
    int count;
    int countP;
    int computerCountW;
    int personCountW;
    Computer computer;
    Person person;

    public Game(String computerName, String personName) {
        init(computerName,personName);
    }

    /**
     * 创建电脑和用户角色
     * @param computerName  电脑角色名称
     * @param personName    用户角色名称
     */
    public void init(String computerName, String personName){
        computer = new Computer(computerName);
        person = new Person(personName);
    }

    /**
     * 用户输入出拳代数，开始游戏
     */
    public void begin(){
        int personQuan = person.showQuan();
        int computerQuan = computer.showQuan();
        if (personQuan == 0 || personQuan == -1) {
            System.out.println("抱歉，您输入的指令有误。");
        } else if (personQuan == computerQuan) {
            System.out.println(computer.getName() + "【电脑】出拳："+computerQuan+"—————"+person.getName()+ "【玩家】出拳"+personQuan);
            System.out.println("平局");
            countP++;
        } else if ((computerQuan == 1 && personQuan == 3) || (computerQuan == 2 && personQuan == 1) || (computerQuan == 3 && personQuan == 1)) {
            System.out.println(computer.getName() + "【电脑】出拳："+computerQuan+"—————"+person.getName()+ "【玩家】出拳"+personQuan);
            System.out.println(computer.getName() + "【电脑】获胜");
            computer.addScore();
            person.subScore();
            computerCountW++;
        } else {
            System.out.println(computer.getName() + "【电脑】出拳："+computerQuan+"—————"+person.getName()+ "【玩家】出拳"+personQuan);
            System.out.println(person.getName()+ "【玩家】获胜");
            computer.subScore();
            computer.addScore();
            personCountW++;
        }
    }

    /**
     * 打印输出游戏胜负统计
     */
    public void showMessage(){
        System.out.println("共游戏"+count+"局,玩家获胜"+personCountW+"局,电脑获胜"+computerCountW+"局,平局"+countP+"局。");
        if (computer.getScore()>person.getScore()){
            System.out.println(computer.getName() + "【电脑】获胜");
        } else if (computer.getScore()<person.getScore()) {
            System.out.println(person.getName()+ "【玩家】获胜");
        }else {
            System.out.println("双方总分相等，平局");
        }
    }
}
