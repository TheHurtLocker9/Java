package com.lyx.demo;

import java.util.ArrayList;

public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    /**
     * Manager发普通红包
     * @param money 红包总金额
     * @param count 红包个数
     * @return 红包集合，大小为红包个数
     */
    public ArrayList<Integer> sendRedPacket(int money,int count){
        ArrayList<Integer> redList = new ArrayList<>();
        if (money>this.getMoney()){
            System.out.println("账号余额不足！");
            return redList;
        }
        int everyMoney = money/count;
        for (int i = 0; i < count-1; i++) {
            redList.add(everyMoney);
        }
        int lastRedMoney = everyMoney+money%count;//不能平均分配的余额归入最后一个红包
        redList.add(lastRedMoney);
        setMoney(this.getMoney()-money);
        return redList;
    }
}
