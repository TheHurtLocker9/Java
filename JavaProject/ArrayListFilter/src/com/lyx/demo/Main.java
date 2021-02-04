package com.lyx.demo;

import java.util.ArrayList;
import java.util.Random;

/**
 * 生产20个随机数（1-50）放入数组列表
 * 建立一个方法过滤其中的偶数
 * 装入新的数组列表返回
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> randomsList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            randomsList.add(random.nextInt(50)+1);
        }
        System.out.println("原随机数数组列表："+randomsList);
        System.out.println("过滤后的随机数偶数数组列表："+filter(randomsList).toString());
    }
    public static ArrayList filter(ArrayList<Integer> arrayList){
        ArrayList<Integer> evenNumList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            int num = arrayList.get(i);
            if (num%2==0){
                evenNumList.add(num);
            }
        }
        return evenNumList;
    }
}
