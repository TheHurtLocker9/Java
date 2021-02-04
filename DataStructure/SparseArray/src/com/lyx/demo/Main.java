package com.lyx.demo;

public class Main {
    public static void main(String[] args) {

        /**
         * 二维数组 ==》 稀疏数组
         */
        //创建一个原始的11*11二维数组
        // 0=无棋子  1=黑子  2=白子
        int[][] chessArr1 = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        chessArr1[7][8] = 1;
        //遍历输出原二维数组
        System.out.println("----------------原始二维数组----------------");
        for (int[] row:chessArr1){
            for (int data:row){
                System.out.printf("%d\t",data);
            }
            System.out.print("\n");
        }
        int sum = 0;
        //遍历统计原二维数组中特殊值的个数
        for (int i = 0; i < chessArr1.length; i++) {
            for (int i1 = 0; i1 < chessArr1[i].length; i1++) {
                if (chessArr1[i][i1]!=0){
                    sum++;
                }
            }
        }
        System.out.println("原二维数组中共有"+sum+"个特殊值");

        //创建对应的稀疏数组
        int[][] sparseArr = new int[sum+1][3];
        //给稀疏数组赋值
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;
        //遍历二维数组 将特殊值存入稀疏数组
        int count = 1;
        for (int i = 0; i < chessArr1.length; i++) {
            for (int i1 = 0; i1 < chessArr1[i].length; i1++) {
                if (chessArr1[i][i1]!=0){
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = i1;
                    sparseArr[count][2] = chessArr1[i][i1];
                    count++;
                }
            }
        }
        //打印输出稀疏数组
        System.out.println("-----------稀疏数组-----------");
        for (int i = 0; i < sparseArr.length; i++) {
            for (int i1 = 0; i1 < sparseArr[i].length; i1++) {
                System.out.printf("%d\t",sparseArr[i][i1]);
            }
            System.out.print("\n");
        }


        /**
         * 稀疏数组 ==》二维数组
         */
        //读取二维数组第一行的数据，创建原始二维数组
        int[][] chessArr2 = new int[sparseArr[0][0]][sparseArr[0][1]];
        //恢复二维数组数据
        for (int i = 1; i < sparseArr.length; i++) {
                int row = sparseArr[i][0];
                int col = sparseArr[i][1];
                int val = sparseArr[i][2];
                chessArr2[row][col] = val;
        }
        //打印输出恢复后的二维数组
        System.out.println("----------------恢复后的二维数组----------------");
        for (int[] row:chessArr2){
            for (int data:row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
    }
}
