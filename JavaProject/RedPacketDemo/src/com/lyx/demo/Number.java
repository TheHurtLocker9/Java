package com.lyx.demo;

import java.util.ArrayList;
import java.util.Random;

public class Number extends User {
    public Number() {
    }

    public Number(String name, int money) {
        super(name, money);
    }

    /**
     * Number成员接受普通红包
     * @param redList 普通红包集合列表
     */
    public void receiveRedPacket(ArrayList<Integer> redList){
        if (redList.size()==0){
            System.out.println("抱歉，红包已经被抢光了！");
            return;
        }
        int getRedPacket = redList.remove(new Random().nextInt(redList.size()));
        setMoney(getMoney()+getRedPacket);
        System.out.println("恭喜您抢到了红包！");
    }
}
