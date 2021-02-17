package com.lyx.demo;

import java.util.Arrays;

public class VariablePara {
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(1));
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
    }

    //可变参数本质上就是参数数组的便捷写法
    private static int sum(int ... arr) {
        int sum = 0;
        for (int i:arr) {
            sum+=i;
        }
        return sum;
    }
}
