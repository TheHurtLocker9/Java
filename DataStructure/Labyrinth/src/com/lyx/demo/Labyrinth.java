package com.lyx.demo;

import java.util.Arrays;

public class Labyrinth {
    public static void main(String[] args) {
        int[][] game = new int[8][8];
        for (int i = 0; i < 8; i++) {
            game[0][i] = 1;
            game[7][i] = 1;
        }
        for (int i = 0; i < 8; i++) {
            game[i][0] = 1;
            game[i][7] = 1;
        }
        game[3][1] = 1;
        game[3][2] = 1;
        System.out.println(setWay(game,1,1));
        for (int i = 0; i < game.length; i++) {
            for (int i1 = 0; i1 < game[i].length; i1++) {
System.out.print(game[i][i1] + " ");
            }
            System.out.println();
        }
    }

    //终点为game[6][6]
    //上-左-下-右 不同的寻路顺序会有不同的结果
    //0-未走  1-墙  2-已走  3-死路
    private static boolean setWay(int[][] game, int x, int y) {
        if (game[6][6] == 2) {
            return true;
        } else {
            if (game[x][y] == 0) {//如果该点未被阻断
                game[x][y] = 2;
                if (setWay(game, x - 1, y)) {//上探路
                    return true;
                } else if (setWay(game, x, y - 1)) {//左探路
                    return true;
                } else if (setWay(game, x + 1, y)) {//下探路
                    return true;
                } else if (setWay(game, x, y + 1)) {//右探路
                    return true;
                } else {
                    game[x][y] = 3;//上下左右均不通，设置为死路
                    return false;
                }
            }else {
                return false;
            }
        }
    }
}
