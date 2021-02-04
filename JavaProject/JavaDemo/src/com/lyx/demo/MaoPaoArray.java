package com.lyx.demo;

public class MaoPaoArray {
    public static void main(String[] args) {
        /**
         * 冒泡排序法
         */
        int[] arr = {8, 17, 48, 44, 69, 34, 77,2};
        for (int i = 0; i < arr.length - 1; i++) {//n个元素，共需冒泡执行n-1趟，每次冒泡出一个
            for (int j = 0; j < arr.length - 1 - i; j++) {//n个元素,每次执行次数为（已完成冒泡排序的i个-1）次
                if (arr[j] > arr[j + 1]) {
                    int k = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = k;
                }
            }
        }
        //增强for循环遍历输出
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
