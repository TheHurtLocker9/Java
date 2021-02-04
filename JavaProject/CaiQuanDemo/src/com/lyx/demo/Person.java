package com.lyx.demo;

import java.util.Scanner;

public class Person {
    private String name;//姓名
    private int score;//分数

    public Person(String name) {
        this.name = name;
    }

    /**
     *用户进行输入 出什么拳
     * @return  -1代表输入类型无效 0代表输入值范围错误 1代表剪刀  2代表石头 3代表布
     */
    public int showQuan(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请用户出拳（输入1代表剪刀  2代表石头 3代表布）");
        if (scanner.hasNextInt()){
            int quan = scanner.nextInt();
            if (quan==1||quan==2||quan==3){
                return quan;
            }else {
                return 0;
            }
        }
        return -1;
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
