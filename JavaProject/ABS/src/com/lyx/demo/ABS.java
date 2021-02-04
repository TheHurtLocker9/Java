package com.lyx.demo;

/**
 * 求-10.8到5.9之间绝对值大于6或小于2.1的整数
 */
public class ABS {
    public static void main(String[] args) {
        double min = -10.8;
        double max = 5.9;
        for (int i = (int) Math.ceil(min); i < max; i++) {
            int abs = Math.abs(i);
            if (abs>6||abs<2.1){
                System.out.println(i);
            }
        }
    }
}
