package com.lyx.demo;

import java.util.*;

/**
 * 斗地主Demo2.0
 * 1.初始化牌库
 * 2.洗牌
 * 3.发牌
 * 4.对玩家手牌进行升序排序（new）
 * 5.打印玩家手牌
 */
public class Game {
    private Map<Integer, String> cardsMap;
    private Player player1;
    private Player player2;
    private Player player3;
    private Player handCards;

    public Game() {
        player1 = new Player("农民1");
        player2 = new Player("农民2");
        player3 = new Player("地主");
        handCards = new Player("底牌");
        cardsMap = initCards();
        dealCard(player1, player2, player3, handCards);
    }

    /**
     * 初始化扑克牌对照库
     *
     * @return 扑克牌对照库
     */
    private Map<Integer, String> initCards() {
        Map<Integer, String> cardsMap = new HashMap<>();
        String[] cardsColour = {"♦", "♥", "♣", "♠"};
        String[] cardsNum = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        int index = 0;
        for (String num : cardsNum) {
            for (String colour : cardsColour) {
                cardsMap.put(index++, colour + num);
            }
        }
        cardsMap.put(index++, "小王");
        cardsMap.put(index, "大王");
        for (int i : cardsMap.keySet()) {
            System.out.println(i + ":" + cardsMap.get(i));
        }
        return cardsMap;
    }

    /**
     * 洗牌并发牌
     *
     * @param player1   农民1
     * @param player2   农民2
     * @param player3   地主
     * @param handCards 底牌
     */
    private void dealCard(Player player1, Player player2, Player player3, Player handCards) {
        ArrayList<Integer> cards = new ArrayList<>(cardsMap.keySet());
        Collections.shuffle(cards);
        int index = 0;
        while (index < 51) {
            switch (index % 3) {
                case 0:
                    player1.getCards().add(cards.get(index++));
                    break;
                case 1:
                    player2.getCards().add(cards.get(index++));
                    break;
                case 2:
                    player3.getCards().add(cards.get(index++));
                    break;
            }
        }
        for (int i = index; i < cards.size(); i++) {
            handCards.getCards().add(cards.get(index++));
        }
        sortCards(player1);
        sortCards(player2);
        sortCards(player3);
    }

    /**
     * 打印输出显示玩家手牌和底牌
     */
    public void printPlayerCards() {
        ArrayList<String> subCards = new ArrayList<>();
        for (int i : player1.getCards()) {
            subCards.add(cardsMap.get(i));
        }
        System.out.println(player1.getName() + ":" + subCards + "共" + player1.getCards().size() + "张");
        subCards.clear();
        for (int i : player2.getCards()) {
            subCards.add(cardsMap.get(i));
        }
        System.out.println(player2.getName() + ":" + subCards + "共" + player2.getCards().size() + "张");
        subCards.clear();
        for (int i : player3.getCards()) {
            subCards.add(cardsMap.get(i));
        }
        System.out.println(player3.getName() + ":" + subCards + "共" + player3.getCards().size() + "张");
        subCards.clear();
        for (int i : handCards.getCards()) {
            subCards.add(cardsMap.get(i));
        }
        System.out.println(handCards.getName() + ":" + subCards);
    }

    /**
     * 手牌排序
     *
     * @param player
     */
    private void sortCards(Player player) {
        //由于扑克牌对照库中索引与扑克牌大小关系一致，所以对手牌排序可以转为直接对索引排序
        Collections.sort(player.getCards(), new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
    }

}
