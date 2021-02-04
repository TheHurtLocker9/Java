package com.lyx.demo;

import sun.security.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySort {
    public static void main(String[] args) {
        /**
         * 合并两数组后排序
         * 合并：采用了Arrays.copyOf方法扩容后进行添加
         * 排序采用了Arrays.sort进行升序排序，但降序需要对int[]数组遍历装箱为Integer[]
         */
        int[] arr1 = {4,7,34,16,1};
        int[] arr2 = {77,17,33,187};
        int[] arrSum = joinArr(arr1,arr2);
        System.out.println(Arrays.toString(arrSum));
        Arrays.sort(arrSum);
        System.out.println("升序排序"+Arrays.toString(arrSum));
//        Arrays.sort(arrSum, Collections.reverseOrder());
//        System.out.println("降序排序"+Arrays.toString(arrSum));
    }

    public static int[] joinArr(int[] arr1,int[] arr2){
        int[] arrSum = Arrays.copyOf(arr1,arr1.length+arr2.length);//数组复制扩容
        for (int i = 0;i<arr2.length;i++){//拼接
            arrSum[arr1.length+i] = arr2[i];
        }
        return arrSum;
    }
}
