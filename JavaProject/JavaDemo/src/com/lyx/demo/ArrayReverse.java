package com.lyx.demo;

import java.util.Arrays;

public class ArrayReverse {
    /**
     * 数组的转置
     * @param args
     */
    public static void main(String[] args) {
        int[] arr1  = {1,2,3,4,5,6,7};
        int[] arr2  = {1,2,3,4,5,6,7,8};
        reverse(arr1);
        reverse(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
    public static void reverse(int[] arr){
        for (int i = 0;i<(arr.length-1)/2;i++){
            int a = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = a;
        }
    }
}
