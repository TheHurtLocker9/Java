package com.lyx.demo;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 求1-9不能重复的K个数字相加总和等于N的组合方式。
 */
public class GroupSum {
    int N = 7;//数字总和
    int K = 3;//数字个数
    ArrayList<int[]> groups = new ArrayList<>();
    int[] group = new int[K];

    private void print(){
        System.out.println(groups.size());
        for (int[] ints : groups) {
            System.out.println(Arrays.toString(ints));
        }
    }
    private void check(int k) {
        if (k == K) {
            groups.add(group.clone());
            return;
        }
        for (int i = 1; i < 10; i++) {
            if (panduan(k,i)){
                group[k] = i;
                check(k+1);
            }
        }
    }

    private boolean panduan(int nowK, int num) {
        int sum = num;
        for (int i = 0; i < nowK; i++) {
            if (num==group[i]){
                return false;
            }
            sum = sum + group[i];
        }
        if (nowK == K - 1) {
            return sum == N;
        } else return sum < N;
    }

    public static void main(String[] args) {
        GroupSum groupSum = new GroupSum();
        groupSum.check(0);
        groupSum.print();
    }
}
