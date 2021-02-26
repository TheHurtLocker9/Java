package com.lyx.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 斗地主Demo
 * 1.初始化牌库
 * 2.洗牌
 * 3.发牌
 * 4.打印玩家手牌
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> cards = initCards();
        System.out.println(cards);
        //集合工具类的方法随机调整集合顺序
        Collections.shuffle(cards);
        System.out.println(cards);
        Player player1 = new Player("农民1");
        Player player2 = new Player("农民2");
        Player player3 = new Player("地主");
        Player handCards = new Player("底牌");
        int index = 0;//设置索引计数器
        //利用求余循环发牌
        while (index<51){
            switch (index%3){
                case 0:
                    player1.getPlayerCards().add(cards.get(index));
                    break;
                case 1:
                    player2.getPlayerCards().add(cards.get(index));
                    break;
                case 2:
                    player3.getPlayerCards().add(cards.get(index));
                    break;
            }
            index++;
        }
        //留三张作为底牌
        while (index<54){
            handCards.getPlayerCards().add(cards.get(index));
            index++;
        }
        System.out.println(player1.getName()+":"+player1.getPlayerCards()+"共"+player1.getPlayerCards().size()+"张");
        System.out.println(player2.getName()+":"+player2.getPlayerCards()+"共"+player2.getPlayerCards().size()+"张");
        System.out.println(player3.getName()+":"+player3.getPlayerCards()+"共"+player3.getPlayerCards().size()+"张");
        System.out.println(handCards.getName()+":"+handCards.getPlayerCards());
    }

    /**
     * 初始化卡牌池
     * @return 有序卡牌集合
     */
    public static ArrayList<String> initCards(){
        String[] cardsColour = {"♦","♥","♣","♠"};
        String[] cardsNum = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        ArrayList<String> cards = new ArrayList<>();
        for (String colour:cardsColour) {
            for (String num:cardsNum) {
                cards.add(colour+num);
            }
        }
        cards.add("大王");
        cards.add("小王");
        return cards;
    }
}
