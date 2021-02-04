package com.lyx.demo;

import java.util.Random;

public class Computer {
    private String name;//姓名
    private int score;//分数

    public Computer(String name) {
        this.name = name;
    }

    /**
     *  展示机器人随机的出拳代数
     * @return 1代表剪刀  2代表石头 3代表布
     */
    public int showQuan(){
        Random random = new Random();
        return random.nextInt(2)+1;
    }

    /**
     * 分数加一
     */
    public void addScore(){
        score++;
    }

    /**
     * 分数减一
     */
    public void subScore(){
        score--;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
